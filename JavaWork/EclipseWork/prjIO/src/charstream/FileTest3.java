package charstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest3 {

	public static void main(String[] args) throws IOException {
		// TODO PrintWriter 예제
//		FileWriter fout = new FileWriter("C:\\jingwang\\JavaWork\\Test\\test3.txt");
		PrintWriter fout = new PrintWriter("C:\\jingwang\\JavaWork\\Test\\test3.txt");
		for(int i = 1; i <10; i++) {
			String data = i + "번째 줄입니다.\r\n";
//			fout.write(data);
			fout.println(data);
		}
		
		fout.close();
	}

}
