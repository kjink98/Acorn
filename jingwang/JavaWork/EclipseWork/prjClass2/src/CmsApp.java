
public class CmsApp {

	public static void main(String[] args) {
		// TODO 상속에 대한 기본 개념
		Cms kim = new Cms(1, "김유신", 'C');
		kim.display();
		
		CmsExt lee = new CmsExt(2, "이순신", 'A', "서울시 강남구");
		lee.print();
	}
}
