package basic02;

public class App {

	public static void main(String[] args) {
		// 인터페이스만 쓰면 객체 생성 부분만 변경해주면 됨
		// 객체를 생성하면 의존성에서 벗어 날 수 없음
		// 객체 생성을 다른 곳에서 하면 의존성을 벗어날 수 있음
		// 의존성을 아예 없애기 위해 팩토리패턴을 이용할 수 있다.
		MessageBean bean = new MessageBeanKr();
		bean.sayHello("홍길동");
		
		bean = new MessageBeanEn();
		bean.sayHello("Tom");
	}

}
