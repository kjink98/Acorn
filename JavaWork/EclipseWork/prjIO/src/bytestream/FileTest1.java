package bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileTest1 {

	public static void main(String[] args) throws IOException{
		// TODO 파일로부터 입력 받아 콘솔로 출력
		// fin에 file 주소값 저장
		FileInputStream fin = new FileInputStream("C:\\jingwang\\JavaWork\\Test\\test.txt");
		int input = 0;
		while(input != -1) { // 2. input에서 입력이 끝날때 컨트롤z 누르면 종료
			input = fin.read(); // 1. fin에서 읽어온 글자를 한 글자씩 input에 저장
//			System.out.print((char)input);
			// OutputStream은 여러 출력 대상을 다룰 수 있는 일반적인 출력 스트림 객체
//			목적에 따라 어떤 것을 사용할 것인지 선택
			// 복잡한 출력 로직이나 다른 출력 대상을 다루어야 하는 경우
			OutputStream os = System.out;
			
			// System.out은 이미 생성된 표준 출력 스트림
			// 콘솔 출력에 대한 간단한 작업
//			System.out.write((char)input);
			os.write((char)input);
			// 확장된 출력(숫자까지 나오게) (남아있을 문자들을 위해)
			os.flush();
		}
		fin.close(); // 쓸모없는 메모리 닫기
	}

}
