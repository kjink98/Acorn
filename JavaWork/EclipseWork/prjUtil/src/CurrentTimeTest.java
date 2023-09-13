
public class CurrentTimeTest {

	public static void main(String[] args) {
		// TODO 시간 차이 구하기 : System.currentTimeMillis()
		long start = System.currentTimeMillis(); // 현재 시간을 1/1000 시간 단위로 저장
		
		int sum = 0;
		for(long i = 0; i < 10000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("걸린 시간 : " + (end - start)/1000);

	}

}
