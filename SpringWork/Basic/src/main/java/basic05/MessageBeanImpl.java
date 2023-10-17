package basic05;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private int age;
	private String greeting;
	
	public MessageBeanImpl() {}
	public MessageBeanImpl(String name, int age, String greeting) {
		this.name = name;
		this.age = age;
		this.greeting = greeting;
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

	@Override
	public void sayHello() {
		String msg = greeting + "!~~ " + name + "님~~ 이제 당신은 " + age + "살 입니다.";
	}

}
