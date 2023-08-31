public class PhoneBook{
	public static void main(String[] args) {
		/*
		java PhoneBook
		사용법 : java PhoneBook 사람이름
		java PhoneBook 홍길동
		
		홍길동 111-1111 서울시 강남구
		----------------------
		String data[][] = {
			{"홍길동", "111-1111", "서울시 강남구"},
			{"임꺽정", "222-2222", "서울시 종로구"},
			{"신사임당", "333-3333", "서울시 도봉구"}
		}
		*/
		
		String data[][] = {
			{"홍길동", "111-1111", "서울시 강남구"},
			{"임꺽정", "222-2222", "서울시 종로구"},
			{"신사임당", "333-3333", "서울시 도봉구"}
		};
		if (args.length == 0){
			System.out.println("사용법 : java PhoneBook 사람이름");
		} else {
			for(int i = 0; i < data.length; i++){
				if(args[0].equals(data[i][0]))
					System.out.print(data[i][0] + " " + data[i][1] + " " + data[i][2]);
			} // for문 종료
		} //else문 종료
	}
}