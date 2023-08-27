class ControlTest {
	/*
	1. 입력받은 값이 문자이면 "문자"라고 출력하고 그렇지 않으면 "기타"라고 출력
	*/
	System.out.println("입력 : ");
	char input = (char) System.in.read();
	if((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z))
		System.out.println("문자");
	else
		System.out.println("기타);

	
	/*
	2. 입력받은 값이 소문자이면 소문자라고 출력하고 대문자이면 대문자라고 출력하고
		숫자면 숫자라고 출력하고 그 외에는 기타라고 출력
	*/
	System.out.println("입력 : ");
	char input2 = (char) System.in.read();
	if(input2 >= 'a' && input2 <= 'z')
		System.out.println("소문자");
	else if (input2 >= 'A' && input2 <= 'Z)
		System.out.println("대문자");
	else if (input2 >= '0' && input2 <= '9')
		System.out.println("숫자");
	else
		System.out.println("기타");

	/*
	3. 간단한 전자계산기 (연산자에 q나 Q를 입력하면 종료)
		연산자 :
		숫자1 :
		숫자2 :
		결과 :
	*/
	int result = 0;
	
	System.out.println("첫 번째 숫자 입력 : ");
	int num1 = System.in.read() - 48;
	System.in.skip(2)
	
	System.out.println("두 번째 숫자 입력 : ");
	int num2 = System.in.read() - 48;
	System.in.skip(2)
	
	System.out.println("연산자 입력 : ");
	char operator = char(System.in.read();
	
	if(operator == '+')
		result = num1 + num2;
	else if(operator == '-')
		result = num1 - num2;
	else if(operator == '/')
		result = num1 / num2;
	else if(operator == '*')
		result = num1 * num2;
	else if(operator == 'q' || operator == 'p')
		return;
	else
		System.out.println('+, -, *, / 연산자만 사용해주세요');
		int result = 0;
	
	System.out.println("첫 번째 숫자 입력 : ");
	int num1 = System.in.read() - 48;
	System.in.skip(2)
	
	System.out.println("두 번째 숫자 입력 : ");
	int num2 = System.in.read() - 48;
	System.in.skip(2)
	
	System.out.println("연산자 입력 : ");
	char operator = (char)System.in.read();
	
	if(operator == '+')
		result = num1 + num2;
	else if(operator == '-')
		result = num1 - num2;
	else if(operator == '/')
		result = num1 / num2;
	else if(operator == '*')
		result = num1 * num2;
	else if(operator == 'q' || operator == 'p')
		break;
	else
		System.out.println('+, -, *, / 연산자만 사용해주세요');
	
	System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
	

	/*
	간단한 도움말 시스템을 만들자
	1. if
	2. switch
	3. while
	4. for
	번호선택 : 1
	if (조건식) 문장;

	1. if
	2. switch
	3. while
	4. for
	번호선택 : 3
	while (조건식) 문장;

	...

	번호선택 : 0을 누르면 종료
	*/
	System.out.println("1.if");
	System.out.println("2.switch");
	System.out.println("3.while");
	System.out.println("4.for");
	System.out.println("번호선택 : ");
	char num = (char) System.in.read();
	System.in.skip(2);
	
	switch(num){
		case '1':
		System.out.println("if (조건식) 문장;");
		break;
		
		case '2':
		System.out.println("switch (조건식) 문장;");
		break;
		
		case '3':
		System.out.println("while (조건식) 문장;");
		break;
		
		case '4':
		System.out.println("for (조건식) 문장;");
		break;
		
		case '0':
		System.out.println("종료");
		break;
		
		default:
		System.out.println("1~4, 혹은 0을 입력하세요");
		
	}
	
	/* 
	"." 입력이 될때까지 키보드 입력을 읽어서 입력된 공백의 갯수를 세고 그 합을 출력하시오.
	*/
	
	System.out.println("입력하세요");
	
	char a;
	int cnt = 0;
	
	while(true){
		a = (char)System.in.read();
		if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9'))
			break;
		else if (a == ' ')
			cnt++;
	}
	System.out.println("입력된 공백 개수:" + cnt);
}