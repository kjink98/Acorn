import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO 난수 처리
		Random rnd = new Random();
		
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt(5)); // 0~4 까지의 난수
		
		// (최대값 - 최소값 + 1 ) + 최소값
		// 11 ~ 25의 난수
		System.out.println(rnd.nextInt((25-11+1)+11));
		
		// 가위 바위 보
		// 로또 추출기 (6개를 뽑고, 중복 X)
	}

}
