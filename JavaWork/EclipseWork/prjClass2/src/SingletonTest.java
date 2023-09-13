class SingletonDemo {
	private int i;

	// 바깥에서는 생성 못함
	private SingletonDemo() {
	}

	// 안에서 객체 생성
	// 이 변수는 하나만 만들기 위해 static 사용
	private static SingletonDemo instance = new SingletonDemo();
	
	// private이기 때문에 get method 사용
	// 객체 없이 사용하기 위해 static 사용
	// 더 멀리서도 사용 할 수 있게 public 사용 (생략해도 무방)
	public static SingletonDemo getInstance() {
		return instance;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Singleton Pattern
//		SingletonDemo demo1 = new SingletonDemo();
//		SingletonDemo demo2 = new SingletonDemo();
		SingletonDemo demo1 = SingletonDemo.getInstance();
		SingletonDemo demo2 = SingletonDemo.getInstance();
		
		// 주소 비교
		System.out.println(demo1 == demo2);
	}

}
