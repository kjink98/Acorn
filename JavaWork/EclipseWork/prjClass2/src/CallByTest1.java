/*
public class CallByTest1 {
	void display(int a, int b, int c, int d, int e) {
		System.out.println(a + ", " + b + 
				", " + c + ", " + d + ", " + e);
	}

	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달 1
		int a = 4, b = 7, c = 15, d = 80, e = 9;
		
		CallByTest1 call = new CallByTest1();
		call.display(a, b, c, d, e);
	}

}
*/

// 배열을 이용하는 방법
/*public class CallByTest1 {
	void display(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 7, 15, 80, 9 };

		CallByTest1 call = new CallByTest1();
		call.display(arr);
	}

}*/
/*
// 인스턴스 변수를 이용하는 방법
public class CallByTest1 {
	int a = 4, b = 7, c = 15, d = 80, e = 9;
	
	void display() {
		System.out.println(a + ", " + b + 
				", " + c + ", " + d + ", " + e);
	}

	public static void main(String[] args) {
		
		
		CallByTest1 call = new CallByTest1();
		call.display();
	}

}
*/

/*
public class CallByTest1 {
	int i;
	double d;
	char c;
	boolean b;
	String s;
	
	CallByTest1(int i, double d, char c, boolean b, String s){
		this.i = i;
		this.d = d;
		this.c = c;
		this.b = b;
		this.s = s;
	}
	void display() {
		System.out.println(i + ", " + d + 
				", " + c + ", " + b + ", " + s);
	}

	public static void main(String[] args) {
		int i = 4;
		double d = 3.14;
		char c = '가';
		boolean b = true;
		String s = "홍길동";
		
		CallByTest1 call = new CallByTest1(i, d, c, b, s);
		call.display();
		*/

class ArgData {
	//DTO 패턴 (Data Transfer Object)
	int i = 4;
	double d = 3.14;
	char c = '가';
	boolean b = true;
	String s = "홍길동";
}

public class CallByTest1 {
	void display(ArgData data) {
		System.out.println(data.i + ", " + data.d
				+ ", " + data.c + ", " + data.b + ", " + data.s);
	}

	public static void main(String[] args) {
		ArgData data = new ArgData();
		
		CallByTest1 call = new CallByTest1();
		call.display(data);
	}

}
