//
//public class ExcDemo1 {
//
//	public static void main(String[] args) {
//		int[] arr = new int[3];
//		
//		System.out.println("Exception 실행 예제...");
//		
//		arr[7] = 10;
//		
//		System.out.println("이 문장이 보이는가?");
//		// 오류코드가 유저에게 보이면 해킹의 위험성 있음
//		// 그 주도권을 개발자가 갖게 하기 위해 예외처리 사용
//	}
//
//}

public class ExcDemo1 {

	public static void main(String[] args) {
		int[] arr = new int[3];

		System.out.println("Exception 실행 예제...");
		try {
			arr[2] = 10;
			// ...
			double d = 10 / 0;
		} /*
		catch (ArrayIndexOutOfBoundsException err) {
			System.out.println("배열의 범위를 벗어났습니다.");
		} catch (ArithmeticException err) {
			System.out.println("산술 연산을 잘못했습니다.");
		} catch (RuntimeException err) {
			System.out.println("실행 중 오류");
		} */
		catch (Exception err) {
			System.out.println("오류 발생 : " + err);
		}
		
		System.out.println("이 문장이 보이는가?");
		// 오류코드가 유저에게 보이면 해킹의 위험성 있음
		// 그 주도권을 개발자가 갖게 하기 위해 예외처리 사용

	}

}
