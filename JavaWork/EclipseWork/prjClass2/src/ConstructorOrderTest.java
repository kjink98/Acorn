class A {
	A() {
		System.out.println("A 생성자 호출됨");
	}
}

class B extends A{
	B(int i) {
		System.out.println("B 생성자 호출됨");
	}
	B(){};
}

class C extends B{
	C() {
		//super(); // 숨겨져 있는 코드. 부모 기본 생성자를 호출함
		System.out.println("C 생성자 호출됨");
	}
}

public class ConstructorOrderTest {

	public static void main(String[] args) {
		// TODO 생성자 호출 순서
		new C();
	}

}
