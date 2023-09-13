//interface Inter1 {
//	int a = 1; // public static final이 생략 돼있음
//
//	void Inter1Method();
//
//}

abstract class Inter1{
	static int a = 1;
	
	abstract void Inter1Method();
}

public class InterfaceTest1 extends Inter1 {

	public void Inter1Method() { // interface에서 public이 생략돼있기 때문에 클래스 안에서는
		// public 생략 하면 안 됨
		System.out.println("오버라이드됨.");
	};
	public static void main(String[] args) {
		// TODO 인터페이스 기본 문법
		System.out.println(Inter1.a);
		// Inter.a = 10; // 수정 불가

	}

}
