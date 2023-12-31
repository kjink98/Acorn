
public class ExcDemo3 {

	public static void main(String[] args) {
		int[] arr = new int[3];

		System.out.println("Exception 실행 예제...");
		try {
			arr[7] = 10;
		} catch (Exception err) {
			System.out.println("오류 발생 : " + err);
			return; // 오류가 나면 종료
//			System.exit(0); // 프로그램 종료, finally도 실행 안 됨 (요즘은 잘 안씀)
		} finally {
			// error가 나든 안나든 무조건 실행되는 코드
			System.out.println("이 곳은 반드시 실행되는 영역");
		}
		System.out.println("이 문장이 보이는가?");
		// 오류코드가 유저에게 보이면 해킹의 위험성 있음
		// 그 주도권을 개발자가 갖게 하기 위해 예외처리 사용
	}

}
