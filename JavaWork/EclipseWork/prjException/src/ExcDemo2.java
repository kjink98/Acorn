import java.io.IOException;
/*
public class ExDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자를 입력해 주세요 : ");
		try {
			int input = java.lang.System.in.read();
			System.out.println("입력받은 값: " + (char)input);
		}
		catch(IOException err) {
			System.out.println("입력 오류 : " + err);
		}
	}

}
*/

public class ExcDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("문자를 입력해 주세요 : ");
		
			int input = java.lang.System.in.read();
			System.out.println("입력받은 값: " + (char)input);
		
	}

}
