import java.util.Vector;

public class GenericTest1 {

	public static void main(String[] args) {
		// TODO 타입을 미리 체크

		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("world");
		v.add("홍길동");
		// ...
		// v.add(100); // <String>이 없을 때 문법적으로 오류는 없음
		/*
		 * String str = null; 
		 * for(int i = 0; i < v.size(); i++) {
		 *  str =
		 * (String)v.get(i); System.out.println(str); 
		 * }
		 */
		for(String str : v)
			System.out.println(str);
	}

}
