// TODO 상속을 위한 샘플 프로그램 - 고객 관리 프로그램
public class Cms {
	private int no;
	String name;
	private char level;

	public Cms(int no, String name, char level) {
		this.no = no;
		this.name = name;
		this.level = level;
	}
	
	// 기본 생성자
	Cms() {
	};
	
	//getter, setter
	int getNo() {
		return no;
	}
	
	void setNo(int no) {
		this.no = no;
	}
	
	String getName(){
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	char getLevel() {
		return level;
	}
	
	void setLevel(char level) {
		this.level = level;
	}
	
	// 출력
	void display() {
		System.out.println("고객 번호: " + no);
		System.out.println("고객 이름: " + name);
		System.out.println("고객 등급: " + level);
	}

}
