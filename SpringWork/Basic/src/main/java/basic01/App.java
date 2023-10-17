package basic01;

public class App {

	public static void main(String[] args) {
		// 이렇게 쓰면 의존성에 위배
		// app과 msgbean을 연결하는 interface를 사용
		MessageBean bean = new MessageBean();
		bean.sayHello("홍길동");
	}

}
