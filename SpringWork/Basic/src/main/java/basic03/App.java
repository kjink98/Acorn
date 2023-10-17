package basic03;


public class App {

	public static void main(String[] args) {
		// 이미 공장은 생성됐으니 생성할 필요 없고 위치만 알아주면 됨
		MessageBeanFactory factory = MessageBeanFactory.newInstance();
		MessageBean bean = factory.createMessage("kr");
		bean.sayHello("홍길동");
		
		bean = factory.createMessage("en");
		bean.sayHello("Tom");
	}

}
