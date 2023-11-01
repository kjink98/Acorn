package io.netsong7;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
/*
//롬북을 이용해 게터세터 자동 생성
@Getter
@Setter
public class LombokTest {
	private String hello;
	private int count;
	
	public static void main(String[] args) {
		LombokTest test = new LombokTest();
		test.setHello("안녕하세요");
		test.setCount(10);
		
		System.out.println(test.getHello());
		System.out.println(test.getCount());
	}

}
*/

@Getter
// 생성자를 통해 자동 주입
// 반드시 상수로 생성
@RequiredArgsConstructor
public class LombokTest {
	private final String hello;
	private final int count;
	
	public static void main(String[] args) {
		LombokTest test = new LombokTest("안녕하세요", 100);
		
		System.out.println(test.getHello());
		System.out.println(test.getCount());
	}

}