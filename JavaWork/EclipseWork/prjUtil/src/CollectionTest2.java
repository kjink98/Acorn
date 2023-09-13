import java.util.ArrayList;

public class CollectionTest2 {

	public static void main(String[] args) {
		// TODO List계열의 클래스들
		
		ArrayList list = new ArrayList();
		list.add("carrie");
		list.add("kairo");
		list.add("kabbin");
		list.add("kairo");
		list.add("terry");
		
		// 순서 o, 중복 o
		System.out.println("데이터 개수 : " + list.size());
		System.out.println(list);
		
		System.out.println("------------------");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------");
		if(list.contains("kairo")) {
			System.out.println("찾았다.");
			System.out.println(list.indexOf("kairo") + "번째 있다.");
		}
		else {
			System.out.println("못찾았다.");
		}
		
		list.add(2, 100); // 2번째에 100을 추가하겠다
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
	}

}
