class InPutTest{
	public static void main(String[] args) throws java.io.IOException{
		System.out.println("문자를 입력해 주세요 : ");
		int input = java.lang.System.in.read();
		System.out.println("입력받은 값: " + (char)input);
		
		System.in.skip(2); // 2. 2byte 이상 이동 (엔터키를 안주기 위해)
		
		System.out.print("숫자를 입력하세요: ");
		input = System.in.read() - 48 ; // 48을 빼는 이유: 아스키 코드값에서 내가 입력한 수를 출력 받기 위해 사용. 약간의 트릭
		System.out.println("입력받은 값: " + input);
		// 1. 현재 입력받을 메모리 위치에 엔터키가 들어가 있어서 엔터가 출력됨
		
		
	}
}