package bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryDataTest {

	public static void main(String[] args) throws IOException {
		// TODO DataInputStream, DataOutputStream
		 FileOutputStream fout = new FileOutputStream("C:\\jingwang\\JavaWork\\Test\\test4.txt");
	
		 // FileOutputStream이라는 객체를 통해서 보완
		 // 클래스를 포장하는 것처럼
		 // 문자나 바이트 형식의 문자만 읽고 쓸 줄 아는 걸 데이터 변환까지 해주어서 파일을 읽고 쓰는 클래스
		 // 바이트를 이진데이터로 저장
		 DataOutputStream dout = new DataOutputStream(fout); 
		 dout.writeChar('가');
		 dout.writeInt(100);
		 dout.writeDouble(3.14);
		 dout.writeBoolean(true);
		 
		 dout.close();
		 fout.close();
		 
		 DataInputStream din = new DataInputStream(new FileInputStream("C:\\jingwang\\JavaWork\\Test\\test4.txt"));
		 
		 System.out.println(din.readChar());
		 System.out.println(din.readInt());
		 System.out.println(din.readDouble());
		 System.out.println(din.readBoolean());
		 
		 din.close();
	}

}
