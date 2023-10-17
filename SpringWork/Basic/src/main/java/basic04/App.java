package basic04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	// 스프링 관리, 시작
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// 경로 설정. 설정 파일 읽어오기
		ctx = new ClassPathXmlApplicationContext("config/basic04_config.xml");
		
		MessageBean bean = ctx.getBean("msgKr", basic04.MessageBean.class);
		bean.sayHello("홍길동");
		
		bean = ctx.getBean("msgKr", basic04.MessageBean.class);
		bean.sayHello("Tom");
		
		bean = ctx.getBean("mkr", basic04.MessageBean.class);
		bean.sayHello("유비");
		
		bean = ctx.getBean("mskr", basic04.MessageBean.class);
		bean.sayHello("관우");
		
		bean = ctx.getBean("kr", basic04.MessageBean.class);
		bean.sayHello("장비");
	}

}
