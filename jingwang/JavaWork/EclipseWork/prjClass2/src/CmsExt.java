
public class CmsExt extends Cms {
	private String address;

	public CmsExt(int no, String name, char level, String address) {
		this.no = no;
		this.name = name;
		this.level = level;
		this.address = address;
	}
	
	void print() {
		display();
		System.out.println("고객 주소: " + address);
	}
}
