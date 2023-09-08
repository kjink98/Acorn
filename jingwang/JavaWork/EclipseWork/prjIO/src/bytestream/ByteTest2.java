package bytestream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTest2 {
	static void StreamTest(InputStream in, OutputStream out) throws IOException{
		int input = in.read();
		
		while(input != -1) { // 몇 글자나 입력 받을 지 모르니 (컨트롤 + z 를 누르면 -1)
			out.write((char)input); // write를 써서 한글이 안깨지게
			input = in.read();
		}
	}
	public static void main(String[] args) throws IOException{
		StreamTest(System.in, System.out);
	}

}
