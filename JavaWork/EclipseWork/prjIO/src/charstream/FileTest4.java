package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest4 {

	public static void main(String[] args) throws IOException {
		// TODO PrintWriter 예제2
		// 파일 저장
		PrintWriter pw = new PrintWriter(new BufferedWriter(
		new FileWriter("C:\\jingwang\\JavaWork\\Test\\sungjuk.txt")));
		
		pw.println("*******성적표********");
		pw.println("--------------------");
		pw.printf("%3s : %5d %5d %5.1f %n", 
				"홍길동", 98, 67, (float)((98+67)/2));
		pw.printf("%3s : %5d %5d %5.1f %n", 
				"임꺽정", 89, 76, (float)((89+76)/2));
		pw.printf("%3s : %5d %5d %5.1f %n", 
				"신돌석", 100, 81, (float)((100+81)/2));
		pw.close();
	}

}
