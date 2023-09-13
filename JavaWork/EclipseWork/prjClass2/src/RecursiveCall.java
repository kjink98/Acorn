
public class RecursiveCall {
	int fact1(int num) {
		int result = 1;
		for(int i = 1; i<=num; i++) {
			result *= i;
		}
		return result;
	}
	
	int fact2(int num) {
		int result = 0;
		if(num == 1)
			return 1;
		
		result = fact2(num-1) * num;
		
		return result;
	}
	public static void main(String[] args) {
		// TODO 재귀 호출
		RecursiveCall obj = new RecursiveCall();
		System.out.println("반복문 사용 : " + obj.fact1(4));
		System.out.println("재귀호출 사용 : " + obj.fact2(4));
		

	}

}
