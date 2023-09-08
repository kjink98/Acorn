package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest3 {

	public static void main(String[] args) throws IOException {
		 FileOutputStream fout = new FileOutputStream("C:\\jingwang\\JavaWork\\Test\\test3.txt");
		 
		 for(int i = 1; i< 10; i++) {
			 String str = i + "번째 줄입니다.\r\n";
			 System.out.println(str);
			 fout.write(str.getBytes());
			// 문자를 바이트로 바꿔줌
		 }
		 fout.close();
	}

	
}
