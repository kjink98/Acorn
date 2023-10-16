package dom;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Test1 {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = 
                DocumentBuilderFactory.newInstance(); // DOM 공장 생성
        
        DocumentBuilder builder = 
                factory.newDocumentBuilder(); // 공장 안에 작업실 생성
        FileInputStream xmlFile = 
                new FileInputStream("C:\\jingwang\\JspWork\\EclipseWork\\AJAXApp\\src\\main\\webapp\\dom\\test.xml"); // 트리구조로 저장
        Document doc = builder.parse(xmlFile); // 가져온 file을 builder에 파싱한 후 doc에 저장
        
        Element root = doc.getDocumentElement(); // 트리구조로 되어있는 파일중에 가장 꼭대기에 있는 정보를 가져옴
        System.out.println(root.getNodeName());
        System.out.println(root.getNodeValue());
        System.out.println(root.getNodeType());
        
        System.out.println("----------------------------------------------");
        
        Node n1 = root.getFirstChild();
        System.out.println(n1.getNodeName());
        System.out.println(n1.getNodeValue());
        System.out.println(n1.getNodeType());
        
        System.out.println("----------------------------------------------");
        
        Node n2 = root.getLastChild();
        System.out.println(n2.getNodeName());
        System.out.println(n2.getNodeValue());
        System.out.println(n2.getNodeType());
        
        System.out.println("----------------------------------------------");
        
        // 홍길동의 이름과 나이 출력
        System.out.println(n1.getFirstChild().getFirstChild().getNodeValue());
        
        xmlFile.close();
    }

}
