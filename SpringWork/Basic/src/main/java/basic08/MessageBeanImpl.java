package basic08;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private int age;
	private String greeting;
	
	// 2개의 outputter를 전달받을떄 
	// Qualifier를 사용해서 밸류값을 비교해서 가져옴
	@Qualifier("out1")
	private Outputter outputter;
	
	public MessageBeanImpl() {}
	public MessageBeanImpl(String name, int age, String greeting) {
		this.name = name;
		this.age = age;
		this.greeting = greeting;
	}
	
	public MessageBeanImpl(Outputter outputter) {
		this.outputter = outputter;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	 //같은 타입이 있다면 값을 넣어줌
	@Autowired
	@Qualifier("out1")
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
		}
	@Override
	public void sayHello() {
		String msg = name + "님~~ 이제 당신은 " + age + "살 입니다.2";
		System.out.println(msg);
		
		try {
			outputter.output(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
