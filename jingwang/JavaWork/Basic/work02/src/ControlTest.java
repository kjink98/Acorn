class ControlTest {
	/*
	1. �Է¹��� ���� �����̸� "����"��� ����ϰ� �׷��� ������ "��Ÿ"��� ���
	*/
	System.out.println("�Է� : ");
	char input = (char) System.in.read();
	if((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z))
		System.out.println("����");
	else
		System.out.println("��Ÿ);

	
	/*
	2. �Է¹��� ���� �ҹ����̸� �ҹ��ڶ�� ����ϰ� �빮���̸� �빮�ڶ�� ����ϰ�
		���ڸ� ���ڶ�� ����ϰ� �� �ܿ��� ��Ÿ��� ���
	*/
	System.out.println("�Է� : ");
	char input2 = (char) System.in.read();
	if(input2 >= 'a' && input2 <= 'z')
		System.out.println("�ҹ���");
	else if (input2 >= 'A' && input2 <= 'Z)
		System.out.println("�빮��");
	else if (input2 >= '0' && input2 <= '9')
		System.out.println("����");
	else
		System.out.println("��Ÿ");

	/*
	3. ������ ���ڰ��� (�����ڿ� q�� Q�� �Է��ϸ� ����)
		������ :
		����1 :
		����2 :
		��� :
	*/
	int result = 0;
	
	System.out.println("ù ��° ���� �Է� : ");
	int num1 = System.in.read() - 48;
	System.in.skip(2)
	
	System.out.println("�� ��° ���� �Է� : ");
	int num2 = System.in.read() - 48;
	System.in.skip(2)
	
	System.out.println("������ �Է� : ");
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
		System.out.println('+, -, *, / �����ڸ� ������ּ���');
		int result = 0;
	
	System.out.println("ù ��° ���� �Է� : ");
	int num1 = System.in.read() - 48;
	System.in.skip(2)
	
	System.out.println("�� ��° ���� �Է� : ");
	int num2 = System.in.read() - 48;
	System.in.skip(2)
	
	System.out.println("������ �Է� : ");
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
		System.out.println('+, -, *, / �����ڸ� ������ּ���');
	
	System.out.println("���: " + num1 + " " + operator + " " + num2 + " = " + result);
	

	/*
	������ ���� �ý����� ������
	1. if
	2. switch
	3. while
	4. for
	��ȣ���� : 1
	if (���ǽ�) ����;

	1. if
	2. switch
	3. while
	4. for
	��ȣ���� : 3
	while (���ǽ�) ����;

	...

	��ȣ���� : 0�� ������ ����
	*/
	System.out.println("1.if");
	System.out.println("2.switch");
	System.out.println("3.while");
	System.out.println("4.for");
	System.out.println("��ȣ���� : ");
	char num = (char) System.in.read();
	System.in.skip(2);
	
	switch(num){
		case '1':
		System.out.println("if (���ǽ�) ����;");
		break;
		
		case '2':
		System.out.println("switch (���ǽ�) ����;");
		break;
		
		case '3':
		System.out.println("while (���ǽ�) ����;");
		break;
		
		case '4':
		System.out.println("for (���ǽ�) ����;");
		break;
		
		case '0':
		System.out.println("����");
		break;
		
		default:
		System.out.println("1~4, Ȥ�� 0�� �Է��ϼ���");
		
	}
	
	/* 
	"." �Է��� �ɶ����� Ű���� �Է��� �о �Էµ� ������ ������ ���� �� ���� ����Ͻÿ�.
	*/
	
	System.out.println("�Է��ϼ���");
	
	char a;
	int cnt = 0;
	
	while(true){
		a = (char)System.in.read();
		if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9'))
			break;
		else if (a == ' ')
			cnt++;
	}
	System.out.println("�Էµ� ���� ����:" + cnt);
}