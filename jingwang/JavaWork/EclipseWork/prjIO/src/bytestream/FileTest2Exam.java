package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2Exam {

	static void copy() throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\jingwang\\JavaWork\\Test\\test3.txt");
		FileInputStream fin = new FileInputStream("C:\\jingwang\\JavaWork\\Test\\test.txt");

		int input = 0;
		while ((input = fin.read()) != -1) {
			fout.write((char) input);
		}
		System.out.println("복사 완료 되었습니다.");
		fin.close();
		fout.close();
	}

	static void comp() throws IOException {
		FileInputStream input1 = new FileInputStream("C:\\jingwang\\JavaWork\\Test\\test.txt");
		FileInputStream input2 = new FileInputStream("C:\\jingwang\\JavaWork\\Test\\test3.txt");

		boolean check = true;

		while (true) {
			int input1Data = input1.read();
			int input2Data = input2.read();
			if (input1Data != input2Data) {
				check = false;
				break;
				
//				 두 파일에서 동시에 파일의 끝(End of File, EOF)을 읽은 경우를 검사합니다.
//				 파일의 끝에 도달한 경우, 두 파일의 내용을 모두 읽은 것이므로 파일 비교를 종료합니다.
			} else if (input1Data == -1 && input2Data == -1) {
				break;
			}
		}
		if (check) {
			System.out.println("두 문서 내용이 같습니다.");
		} else {
			System.out.println("두 문서 내용이 다릅니다.");
		}

		input1.close();
		input2.close();
	}

	public static void main(String[] args) throws IOException {
		/*
		 * java Jcopy a.txt b.txt java에서 Jcopy클래스를 만들어서 a텍스트를 b텍스트로 복사하는 프로그램 java Jcomp
		 * a.txt b.txt 중복확인
		 */
		copy();
		comp();

	}

}
