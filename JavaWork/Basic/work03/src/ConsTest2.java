class ConsDemo2{
	int iVal;
	double dVal;
	
	// ���2
	ConsDemo2(int i, double d){
		iVal = i;
		dVal = d;
	}
	
	// ��� 1
	void setVal(int i, double d){
		/*
			���� �ڵ�
		*/
		iVal = i;
		dVal = d;
	}
	
	// �⺻ ������
	ConsDemo2(){}
}

public class ConsTest2 {
	public static void main(String[] args) {
		// �⺻ ������
		ConsDemo2 ob = new ConsDemo2();
		System.out.println(ob.iVal);
		
		// �ʱ�ȭ �ȵǼ� ����
		//int i;
		//System.out.println(i);
		
		// ���� �̸��� ������ ���ȼ��� ������
		// �����͸� �����ϰ� �����ϴ� ���ɼ��� �ʿ��ѵ�
		// �׷� ���ɼ� ���� ������ ���� ������ �ٷ� �����ϴ� ������ ��
		//ob.iVal = 100;
		//ob.dVal = 10.0;
		
		// ���� �ڵ� �ۼ�
		/*
			100�� ������ �ִ��� �����ϴ� �ڵ�
			������ ������ ������� ������ ��� �� �� ������
			�޼ҵ带 ����� ȣ���ϴ� ����� ���
		*/
		
		// ���1
		ob.setVal(100, 10.0);
		
		// ���2
		ConsDemo2 ob2 = new ConsDemo2(100, 10.0);
	}
}