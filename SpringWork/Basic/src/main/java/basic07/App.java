package basic07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// 경로 설정. 설정 파일 읽어오기
		ctx = new AnnotationConfigApplicationContext(ApplicationContextConfigure.class);
		
		MessageBean bean = ctx.getBean("getMessageKr", basic07.MessageBean.class);
		bean.sayHello();
		
		bean = ctx.getBean("getMessageEn", basic07.MessageBean.class);
		bean.sayHello();
	}

}
