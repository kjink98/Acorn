package basic05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	// 스프링 관리, 시작
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// 경로 설정. 설정 파일 읽어오기
		ctx = new ClassPathXmlApplicationContext("config/basic05_config.xml");
		
		// 부모 클래스로 가져오기
		MessageBean bean = ctx.getBean("messageBean", MessageBean.class);
		// 소비자는 편하게 sayHello만 가져오면 됨 (Ioc)
		bean.sayHello();
	}

}
