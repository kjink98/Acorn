package dom;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Test2 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        DocumentBuilderFactory factory = 
                DocumentBuilderFactory.newInstance(); // DOM 공장 생성
        
        DocumentBuilder builder = 
                factory.newDocumentBuilder(); // 공장 안에 작업실 생성
        Document doc = 
                builder.parse("C:\\jingwang\\JspWork\\EclipseWork\\AJAXApp\\src\\main\\webapp\\dom\\test.xml"); // 가져온 file을 builder에 파싱한 후 doc에 저장
        
        Element root = doc.getDocumentElement(); // studentds를 가리킴
        
        // 첫 번째 자식부터 자식이 null이 아니라면 다음 형제로 계속 가겠다
        for(Node n = root.getFirstChild(); n!=null; n=n.getNextSibling()) {
            if(n.getNodeType() == Node.ELEMENT_NODE) {
                // 또는 if(n.getNodeType() == 1)
                // 또는 n.getNodeName().equals("students"))
                // getNodeType이 공백이 아닐 때, 태그가 아닐 때만 처리하겠다
                Element e = doc.createElement("address"); // address 태그 만들기
                Text t = doc.createTextNode("서울시 강남구"); // 글자 노드 만들기
                
                e.appendChild(t); // 태그안에 text추가
                n.appendChild(e); // 노드안에 element추가
            }
        }
        
        // 홍길동의 주소
        // 공백의 형제의 마지막 자식의 text
        System.out.println(root.getFirstChild().getNextSibling().getLastChild().getTextContent());
        
        // 수정한 내용을 실제 파일에 적용
        TransformerFactory transFactory =
                TransformerFactory.newInstance(); // 공장 생성
        Transformer trans = transFactory.newTransformer(); // 공장 안에 작업실 생성
        
        trans.setOutputProperty(OutputKeys.ENCODING, "utf-8");
        trans.setOutputProperty(OutputKeys.INDENT, "yes"); // 들여쓰기 유무
        
        DOMSource source = new DOMSource(doc); // 파일로 전달하기 위해 포장, 원본에 있는 데이터
        StreamResult result = 
                new StreamResult(new FileOutputStream("C:\\jingwang\\JspWork\\EclipseWork\\AJAXApp\\src\\main\\webapp\\dom\\test2.xml")); // 어디다가 저장할 지
    
        trans.transform(source, result);
    }

}
