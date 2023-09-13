package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력받아 파일로 출력
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\jingwang\\JavaWork\\Test\\test3.txt"));
		Scanner sc = new Scanner(System.in);
		
		String input = null;
		while (true) {
			input = sc.next();

			if (input.equals("q")) {
				break;
			}
			bw.write(input);
			bw.newLine();
			System.out.println(input);
		}
		bw.close();
		sc.close();
	}
}

/*
 * java Jcopy a.txt b.txt java에서 Jcopy클래스를 만들어서 a텍스트를 b텍스트로 복사하는 프로그램
 */