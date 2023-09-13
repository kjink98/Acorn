/*
public class CallByTest2 {
	int num1 = 10, num2 = 15;

	void swap(CallByTest2 m) {
		int temp = m.num1;
		m.num1 = m.num2;
		m.num2 = temp;
	}

	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달 2

		System.out.println("두 수의 교환");
		CallByTest2 m2 = new CallByTest2();
		m2.swap(m2);

		System.out.println("num1=" + m2.num1 + ", num2=" + m2.num2);

	}

}
*/

/*public class CallByTest2 {
	
	void swap(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}

	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달 2		
		int nums[] = {10, 15};
		
		System.out.println("두 수의 교환");
		CallByTest2 m2 = new CallByTest2();
		m2.swap(nums); // 주소를 넘김
		//m2.swap(nums[0], nums[1]); // 값을 넘김

		System.out.println("num1=" + nums[0] + ", num2=" + nums[1]);

	}

}
*/
public class CallByTest2 {
	
	int[] swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		int nums[] = {n1, n2};
		return nums;
	}

	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달 2
		int num1 = 10, num2 = 15;
		System.out.println("두 수의 교환");
		CallByTest2 m2 = new CallByTest2();
		
		int[] nums = m2.swap(num1, num2); // swap을 통해 값을 넘기고 nums에 값을 받아옴

		System.out.println("num1=" + nums[0] + ", num2=" + nums[1]);

	}

}