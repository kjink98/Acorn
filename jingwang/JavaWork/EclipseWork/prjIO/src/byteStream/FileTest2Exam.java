package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Jcopy {
	void copy() throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\jingwang\\JavaWork\\Test\\test3.txt");
		FileInputStream fin = new FileInputStream("C:\\jingwang\\JavaWork\\Test\\test.txt");
		
		int input = 0;
		if (input != -1) {
			input = fin.read();
			fout.write((char) input);
			fout.flush();
		}
		fout.close();

	}
}

public class FileTest2Exam {

	public static void main(String[] args) throws IOException {
		/*
		 * java Jcopy a.txt b.txt 
		 * java에서 Jcopy클래스를 만들어서 a텍스트를 b텍스트로 복사하는 프로그램
		 * java Jcomp a.txt b.txt 
		 * 중복확인
		 */
		FileOutputStream fout = new FileOutputStream("C:\\jingwang\\JavaWork\\Test\\test3.txt");
		FileInputStream fin = new FileInputStream("C:\\jingwang\\JavaWork\\Test\\test.txt");
		
		int input = 0;
		while ((input = fin.read()) != -1) {
			fout.write((char) input);
			System.out.print((char) input);
		}
		
		fin.close();
		fout.close();
		
	}

}