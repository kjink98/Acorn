import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO 문자열 분리
		String data = "홍길동, 임꺽정, 신돌석, 강감찬";

		String[] names = data.split(","); // ,를 기준으로 문자열 분리
		for (String name : names) {
			System.out.println(name.trim()); // 공백 제거
		}

		// ,를 기준으로 분리
		StringTokenizer token = new StringTokenizer(data, ", ");
		System.out.println(token.countTokens()); // 몇개로 분리 됐는지

//		System.out.println(token.nextToken()); // 하나씩 꺼내오기
//		System.out.println(token.nextToken());
//		System.out.println(token.nextToken());
//		System.out.println(token.nextToken());

		// hasMoreTokens : 사용할 수 있는 토큰이 더 있는지 확인
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken().trim());
		}
		System.out.println("***********************");

		String data2 = "홍길동+ 임꺽정* 신돌석? 권율~ 강감찬";
		token = new StringTokenizer(data2, "+*?~");
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken().trim());
		}
		
		String data3 = "JavaTM 언어사양 제2판:James Gosling, Bill Join , " +
				"Gilad Bracha:무라카미 마사키:피어슨 에듀케이션:2000:5500";
		
		/*
		 * 책 제목 : JavaTM 언어사양 제2판
		 * 저자 : James Gosling
		 * 		Bill Join
		 * 		Gilad Bracha
		 * 역자 : 무라카미 마사키
		 * 출판사 : 피어슨 에듀케이션
		 * 출판연도 : 2000
		 * 책가격 : 5500
		 */
		token = new StringTokenizer(data3, ":");
		String[] object = {"책 제목", "저자", "역자", "출판사", "출판연도", "책가격"};
		for(int i = 0; i <object.length; i++ ) {
			System.out.println(object[i] + " : " + token.nextToken());
		}
	}

}
