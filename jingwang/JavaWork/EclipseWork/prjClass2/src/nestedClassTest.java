
public class nestedClassTest {

	public static void main(String[] args) {
		// TODO 중첩 클래스 활용 테스트
/*
		// 내부 클래스가 static일 경우
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.innerMethod();
//		ic.inner1 = 100;
//		System.out.println(ic.inner1);
 * */
		// 내쿠 클래스가 General일 경우
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.innerMethod();
		
	}

}
