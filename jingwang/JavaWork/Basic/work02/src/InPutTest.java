class InPutTest{
	public static void main(String[] args) throws java.io.IOException{
		System.out.println("���ڸ� �Է��� �ּ��� : ");
		int input = java.lang.System.in.read();
		System.out.println("�Է¹��� ��: " + (char)input);
		
		System.in.skip(2); // 2. 2byte �̻� �̵� (����Ű�� ���ֱ� ����)
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		input = System.in.read() - 48 ; // 48�� ���� ����: �ƽ�Ű �ڵ尪���� ���� �Է��� ���� ��� �ޱ� ���� ���. �ణ�� Ʈ��
		System.out.println("�Է¹��� ��: " + input);
		// 1. ���� �Է¹��� �޸� ��ġ�� ����Ű�� �� �־ ���Ͱ� ��µ�
		
		
	}
}