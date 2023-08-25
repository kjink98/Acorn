class OpTest{
	public static void main(String[] args) {
		// &&와 &의 차이
		int a = 10, b = 7;
		
		// java.lang.System.out.println(a && b);
		java.lang.System.out.println(a>5 && b<3);
		
		java.lang.System.out.println(a>5 & b<3);
		java.lang.System.out.println(a & b);
		
		java.lang.System.out.println(a>12 && ++b>5);
		java.lang.System.out.println("b: " + b);
		
		// 형 변환 연산자
		double d1 = 3.5, d2 = 2.3;
		
		// 강제 형변환
		int c = (int)d1 + (int)d2;
		java.lang.System.out.println("c: " + c);
		
		// 자동으로 형변환 됨
		double d3 = c;
		java.lang.System.out.println("d3: " + d3); 
		
		byte b1 = (byte)c;
		java.lang.System.out.println("b1: " + b1);
		
		b1 = 100 + 5;
		java.lang.System.out.println("b1: " + b1);
		
		b1 = (byte)(b1 + 5);
		java.lang.System.out.println("b1: " + b1);
		
		b1 += 5; // 자동 캐스팅 (형변환 없어도 됨)
		java.lang.System.out.println("b1: " + b1);
		
		// float f1 = (float)3.14;
		float f1 = 3.14f;
		java.lang.System.out.println("f1: " + f1);
		
		// f1 = f1 + 2.5;
		f1 += 2.5;
		java.lang.System.out.println("f1: " + f1);
		
		int i = 'a';
		java.lang.System.out.println("i: " + i);
		
		char c1 = 98;
		java.lang.System.out.println("c1: " + c1);
		
		long x = 10000000000L;
		
	}
}