package charstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//public class CharTest2 {
//	static void StreamTest(InputStream in) throws IOException{
//		// in이라는 byte스트림을 string스트림으로 변환
//		InputStreamReader isr = new InputStreamReader(in);
//		
//		int input = isr.read();
//		
//		while(input != -1) { // 몇 글자나 입력 받을 지 모르니 (컨트롤 + z 를 누르면 -1)
//			System.out.print((char)input); 
//			input = isr.read();
//		}
//	}
//	public static void main(String[] args) throws IOException{
//		StreamTest(System.in);
//	}
//
//}

public class CharTest2 {
	static void StreamTest(InputStream in) throws IOException{
		// in이라는 byte스트림을 string스트림으로 변환
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		String input = br.readLine();
		
		while(input != null) { // 몇 글자나 입력 받을 지 모르니 (컨트롤 + z 를 누르면 -1)
			System.out.print(input); 
			input = br.readLine();
		}
		isr.close();
		br.close();
	}
	public static void main(String[] args) throws IOException{
		StreamTest(System.in);
	}

}

