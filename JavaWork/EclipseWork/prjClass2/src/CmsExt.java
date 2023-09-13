
public class CmsExt extends Cms {
	private String address;
	String name;
	public CmsExt(int no, String name, char level, String address) {
		/*
		this.no = no;
		this.name = name;
		this.level = level;
		*/
		
		
		/*
		// getter, setter
		setNo(no);
		setName(name);
		setLevel(level);
		*/
		
		// 부모의 생성자를 호출
		super(no, name, level);
		this.name = "자식입니다.";
		this.address = address;
		
	}
	/*void print() {
		display();
		System.out.println("고객 주소: " + address);
		System.out.println("고객 이름: " + super.name + ", " + this.name);
	}*/
	
	// 오버라이딩. 재정의 하겠다
	void display() {
//		System.out.println("고객 번호: " + getNo());
//		System.out.println("고객 이름: " + name);
//		System.out.println("고객 등급: " + getLevel());
		super.display();
		System.out.println("고객 주소: " + address);
	}
}
