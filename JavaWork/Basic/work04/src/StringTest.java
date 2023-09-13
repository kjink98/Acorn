public class StringTest{
	public static void main(String[] args){
		String[] names = new String[10];
		names[0] = "Tom";
		names[1] = "Johnson";
		names[2] = "Marry";
		
		// String 클래스 사용법
		// https://docs.oracle.com/en/java/javase/20/docs/api/index.html
		
		String str = new String();
		str = "홍길동";
		System.out.println(str);
		
		String str2 = new String("임꺽정");
		System.out.println(str2);
		
		String str3 = "강감찬";
		System.out.println(str3);
		
		// String 클래스 APIs
		System.out.println("--------------------");
		String s1 = "java";
		String s2 = "java"; // s1과 같음. new가 없고 값이 같기 때문에 같은 주소의 값을 할당함
		String s3 = new String("java"); // s1과 다름
		
		if(s1 == s3) // 값을 비교하는게 아니라 주소를 비교함
			System.out.println("s1과 s3는 같다.");
		else
			System.out.println("s1과 s3는 다르다.");
		
		if(s1.equals(s3)) // 주소가 아니라 값을 비교
			System.out.println("s1과 s3는 같다.");
		else
			System.out.println("s1과 s3는 다르다.");
		
		System.out.println("Java".equalsIgnoreCase(s2));
		
		String s4 = "java is beautiful";
		String s5 = "java just one";
		
		System.out.println(s4.compareTo(s5));
		
		System.out.println(s4.charAt(3));
		
		System.out.println(s4.indexOf("is"));
		System.out.println(s4.indexOf("a"));
		System.out.println(s4.lastIndexOf("a"));
		System.out.println(s4.indexOf("love"));
		
		System.out.println(s4.substring(5, 6));
		System.out.println(s4.substring(5));
		
		String[] sp = s4.split(" ");
		for(String s : sp){ // sp 배열에 있는 객체들을 꺼내 쓰겠다
			System.out.println(s);			
		}
		
		// 불변성
		String s6 = "javu";
		s6 = "java";
		System.out.println("s6 : " + s6);
		
		String s7 = s6.concat(" is number one");
		System.out.println("s7 : " + s7);
		System.out.println(s6 == s7);
	
		// 주소값이 같음
		StringBuffer s8 = new StringBuffer("java");
		StringBuffer s9 = s8.append(" is number one");
		System.out.println(s8 == s9);
		
	}
}