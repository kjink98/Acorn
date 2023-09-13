/*
// 내부 클래스가 static일 경우
public class OuterClass {
	private int outer1;
	
	static class InnerClass {
		
		
		private int inner1;

		void innerMethod() {
			System.out.println("innerMethod() 호출됨");
//			OuterClass oc = new OuterClass();
//			oc.outer1 = 200;
//			System.out.println(oc.outer1);
			
//			outer1 = 20;
		}
	}

	public static void main(String[] args) {
		// TODO 중첩 클래스
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		ic.inner1 = 100;
		System.out.println(ic.inner1);

		
	}

}
*/

// 내부 클래스가 일반 클래스일 경우
// 바깥에 있는 클래스 먼저 만들고 이너 클래스 만듦
// static 은 어차피 남남이니까 따로 생성되도 상관없음
public class OuterClass {
	private int outer1;

	class InnerClass {

		private int inner1;

		void innerMethod() {
			System.out.println("innerMethod() 호출됨");
//			OuterClass oc = new OuterClass();
//			oc.outer1 = 200;
//			System.out.println(oc.outer1);
			// 내부 클래스에서 그냥 가져와 쓸 수 있음
			outer1 = 200;
			System.out.println(outer1);
//			outer1 = 20;
		}
	}

	public static void main(String[] args) {
		// TODO 중첩 클래스
		// 바깥에 있는 클래스 먼저 만들고 이너 클래스 만듦
//		OuterClass oc = new OuterClass();
//		InnerClass ic = oc.new InnerClass();
		InnerClass ic = new OuterClass().new InnerClass();
		ic.innerMethod();
		ic.inner1 = 100;
		System.out.println(ic.inner1);

	}

}