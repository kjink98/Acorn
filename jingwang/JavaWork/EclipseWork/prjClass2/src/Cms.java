// TODO 상속을 위한 샘플 프로그램 - 고객 관리 프로그램
public class Cms {
	int no;
	String name;
	char level;

	public Cms(int no, String name, char level) {
		this.no = no;
		this.name = name;
		this.level = level;
	}

	Cms() {
	};

	void display() {
		System.out.println("고객 번호: " + no);
		System.out.println("고객 이름: " + name);
		System.out.println("고객 등급: " + level);
	}

}
