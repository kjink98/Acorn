import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest3 {

	public static void main(String[] args) {
		// TODO Map
		HashMap map = new HashMap();
		map.put("k1", "홍길동");
		map.put("k2", "임꺽정");
		map.put("k3", "유비");
		map.put("k4", "관우");
		map.put("k5", "장비");
		
		// 중복 x 중복된 키 넣으면 마지막에 넣은걸로 대체
		System.out.println("데이터 개수 : " + map.size());
		System.out.println(map);
		
		System.out.println(map.get("k2")); // 키를 넣어서 값 호출
		System.out.println("======================");
		
		// set은 순서가 없기 때문에 for문 사용 불가. iterator 사용
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			String key = (String) it.next(); // 원래는 Object로 받아야 되는데 String으로 받고 싶음. String은 Object의 자식이므로 캐스팅 가능
			System.out.println(map.get(key));
		}
	}

}
