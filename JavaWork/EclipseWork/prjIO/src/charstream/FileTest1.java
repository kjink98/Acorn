package charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		// TODO 파일로부터 입력 받아 콘솔로 출력
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new FileReader("C:\\jingwang\\JavaWork\\Test\\test.txt"));

			String input = null;
			while ((input = br.readLine()) != null) {
				System.out.println(input);
			}
		} // try 종료
		catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없다. : " + e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			}
			catch(IOException e) {}
		}

	}
}
