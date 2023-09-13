public class StringTest{
	public static void main(String[] args){
		String[] names = new String[10];
		names[0] = "Tom";
		names[1] = "Johnson";
		names[2] = "Marry";
		
		// String Ŭ���� ����
		// https://docs.oracle.com/en/java/javase/20/docs/api/index.html
		
		String str = new String();
		str = "ȫ�浿";
		System.out.println(str);
		
		String str2 = new String("�Ӳ���");
		System.out.println(str2);
		
		String str3 = "������";
		System.out.println(str3);
		
		// String Ŭ���� APIs
		System.out.println("--------------------");
		String s1 = "java";
		String s2 = "java"; // s1�� ����. new�� ���� ���� ���� ������ ���� �ּ��� ���� �Ҵ���
		String s3 = new String("java"); // s1�� �ٸ�
		
		if(s1 == s3) // ���� ���ϴ°� �ƴ϶� �ּҸ� ����
			System.out.println("s1�� s3�� ����.");
		else
			System.out.println("s1�� s3�� �ٸ���.");
		
		if(s1.equals(s3)) // �ּҰ� �ƴ϶� ���� ��
			System.out.println("s1�� s3�� ����.");
		else
			System.out.println("s1�� s3�� �ٸ���.");
		
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
		for(String s : sp){ // sp �迭�� �ִ� ��ü���� ���� ���ڴ�
			System.out.println(s);			
		}
		
		// �Һ���
		String s6 = "javu";
		s6 = "java";
		System.out.println("s6 : " + s6);
		
		String s7 = s6.concat(" is number one");
		System.out.println("s7 : " + s7);
		System.out.println(s6 == s7);
	
		// �ּҰ��� ����
		StringBuffer s8 = new StringBuffer("java");
		StringBuffer s9 = s8.append(" is number one");
		System.out.println(s8 == s9);
		
	}
}