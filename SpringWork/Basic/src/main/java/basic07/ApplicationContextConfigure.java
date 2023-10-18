package basic07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//설정 xml를 대신하는 java 설정파일로서 역할을 부여하는 어노테이션
@Configuration
public class ApplicationContextConfigure {
	@Bean
	public MessageBean getMessageKr() {
		MessageBeanKr kr = new MessageBeanKr();
		kr.setName("신돌석");
		kr.setAge(20);
		kr.setOutputter(output());
		return kr;
	}
	
	@Bean
	public MessageBean getMessageEn() {
		MessageBeanEn en = new MessageBeanEn();
		en.setName("Tom");
		en.setAge(30);
		en.setOutputter(output());
		return en;
	}
	
	// 외부에서 불러다 쓸 메소드는 아니니까 bean을 안 붙여도 상관 없음
	public Outputter output() {
		FileOutputter f = new FileOutputter();
		f.setFilePath("c:\\temp\\out.txt");
		return f;
		
	}
}
