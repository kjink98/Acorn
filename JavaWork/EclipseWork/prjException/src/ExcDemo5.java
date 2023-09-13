import java.io.IOException;

public class ExcDemo5 {
	static void second() throws IOException, ArithmeticException { // first() 로 넘겨줌
		System.out.println("second 호출됨");
		
		int i = System.in.read();
		int j = i/3;
		throw new ArrayIndexOutOfBoundsException();
	}
	
	static void first() throws IOException, ArithmeticException { // main 으로 넘겨줌
		System.out.println("first 호출됨");
		second();
	}
	public static void main(String[] args) {
		try {
			first();			
		}
		catch(Exception err) {
			System.out.println("main에서 다 처리함 : " + err);
			err.printStackTrace();
		}
	}

}
