class StaticDemo1{
	int a;
	int b;
	static int c; // c는 고정적으로 한 개만 생성
	// a, b는 demo1, demo2 가 생성 될 때 마다 생성
	
	
}
public class StaticTest1 {
	static int d;

	static void method1() {
		System.out.println("I'm method~");
	}
	
	public static void main(String[] args) {
		// TODO Static이란 무엇인가?
		
		// 객체 생성 없이 바로 사용 가능
		StaticDemo1.c = 100;
		System.out.println("StaticDemo1.c: " + StaticDemo1.c);
		
		StaticDemo1 demo1 = new StaticDemo1();
		StaticDemo1 demo2 = new StaticDemo1();
		
		// 클래스의 멤버는 아니지만 소속에 속해있기 때문에 이렇게도 접근 가능
		System.out.println("demo1.c: " + demo1.c);
		System.out.println("demo2.c: " + demo2.c);
		
		demo1.c = 200;
		System.out.println("StaticDemo1.c: " + StaticDemo1.c);
		System.out.println("demo2.c: " + demo2.c);
		
		// 같은 클래스
		d = 300;
		
		method1();
		
		
	}

}
