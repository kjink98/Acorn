package sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Test1 extends DefaultHandler{
    int cnt;
    // DefaultHandler를 상속받음으로써 오버라이딩 할 수 있음
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance(); // 공장 생성
        SAXParser parser = factory.newSAXParser(); // 작업실 생성
        
        // 파일의 내용이 아닌 정보만 가져오기
        File f = new File("C:\\jingwang\\JspWork\\EclipseWork\\AJAXApp\\src\\main\\webapp\\sax\\test.xml");
        Test1 test1 = new Test1();
        
        // DefaultHandler를 상속 받아야 sax를 처리할 수 있음
        parser.parse(f, test1);
    }

    @Override
    public void startDocument() throws SAXException {
        // <students>
        System.out.println("문서의 시작");
    }

    @Override
    public void endDocument() throws SAXException {
        // </students> 
        System.out.println("문서의 끝");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("시작 태그 : " + qName + ", " + attributes);
        
        System.out.println(attributes.getValue("age") + ", " + attributes.getValue("addr"));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("끝 태그 : " + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("------------------------------------------------");
        System.out.println(cnt++);
        System.out.println(start + " : " + length);
        
        for(int i=start; i<start+length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }

}
