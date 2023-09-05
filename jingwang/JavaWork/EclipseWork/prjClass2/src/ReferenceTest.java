class First{
	int a = 10;
	
	void display() {
		System.out.println("a : " + a);
	}
}

class Second extends First{
	int b = 20;
	
	void show() {
		System.out.println("b : " + b);
	}
}
public class ReferenceTest {

	public static void main(String[] args) {
		// TODO 부모 클래스와 자식 클래스의 참조 관계
		First f1 = new First(); // 객체 생성
		f1.display();
		
		Second s1 = new Second();
		s1.show();
		
		First f2 = f1; // 참조. f2가 f1의 주소를 받는다. 
		// 참조 변수끼리 주소를 주고 받는다.
		f2.display();
		
		// f2 = s1; // 서로 다른 클래스이므로 참조 안 됨.
		// 클래스끼리는 완전한 독립성을 갖고 있음
		f2 = s1; // 상속 관계가 된다면 참조 됨. 부모가 자식의 주소 참조
		
		// Second s2 = f1; // 자식(s2)이 부모(f1)의 주소 참조는 안 됨
		
		f2.a = 30;
		f2.display();
		
		// f2.b = 40; // 부모가 자식을 참조할 수 있지만, 완벽하게 참조하지 못함. 
		// 자식이 확장한 부분은 부모가 접근하지 못함. 부모가 물려준 것만 접근 가능
		
		Second s3 = (Second)f2; // 캐스팅. f2는 Second를 참조하고 있었음
		s3.display();
		s3.show();
	}

}
