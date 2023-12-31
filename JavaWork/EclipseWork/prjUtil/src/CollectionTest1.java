import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTest1 {

	public static void main(String[] args) {
		// TODO Set계열의 클래스들
		HashSet set = new HashSet();

		set.add("carrie");
		set.add("kabbin");
		set.add("kabbin");
		set.add("kairo");
		set.add("kairo");
		set.add("kariss");

		// 중복 안 됨
		System.out.println("데이터 개수 : " + set.size());
		System.out.println(set);

		// 하나씩 뽑기
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 객체를 중복해서 저장할 수 없고 저장 순서가 유지되지 않는다
		// 정렬된 상태로 저장하는 이진 탐색트리 형태로 요소 저장
		TreeSet tree = new TreeSet();
		tree.add("juliet");
		tree.add("terry");
		tree.add("kabbin");
		tree.add("terry");
		tree.add("carrie");

		System.out.println("데이터 개수 : " + tree.size());
		System.out.println(tree);
	}
}