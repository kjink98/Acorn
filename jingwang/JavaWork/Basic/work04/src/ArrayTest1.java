public class ArrayTest1 {
	public static void main(String[] args) {
		int no = 1, kor = 78, eng = 65, mat = 89;
		
		// int first[] = new int[4] // []는 변수 뒤에 있어도 상관 없음
		int[] first = new int[4]; // 공간 생성
		first[0] = 1;
		first[1] = 78;
		first[2] = 65;
		first[3] = 89;
		
		for(int i = 0; i < 4; i++){
			System.out.println(first[i]);
		}
		
		int[] second = {1, 78, 65, 89}; // 배열 객체 생성
		
		// 이 형식은 안됨
		//int[] third;
		//third = {1, 78, 65, 89};
	}
}