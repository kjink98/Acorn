package basic06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	// 스프링 관리, 시작
	private static ApplicationContext ctx, ctx2;

	public static void main(String[] args) {
		// 경로 설정. 설정 파일 읽어오기
		
		ctx = new ClassPathXmlApplicationContext("config/basic06_config.xml");
		//ctx2 = new AnnotationConfigApplicationContext("basic06");
		MessageBean bean = ctx.getBean("msgKr", basic06.MessageBean.class);
		bean.sayHello();
		
		bean = ctx.getBean("messageBeanEn", basic06.MessageBean.class);
		bean.sayHello();
	}

}
