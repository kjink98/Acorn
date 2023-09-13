public class ExcDemo4 {

	public static void main(String[] args) {
		try {
			System.out.println("여기는 try 블럭 내부");
			// 예외처리를 다른 곳에서 처리하기 위해, 테스트를 위해
			// throw는 블럭 안에서, throws는 블럭 바깥에서 사용
			throw new RuntimeException("이것은 테스트용이다.");// 예외 던지기 -> catch가 잡음
		}
		catch(RuntimeException err) {
			System.out.println("예외 처리 : " + err.getMessage());
		}
	}

}
