class ConsDemo1{
	int iVal;
	double dVal;
	
	ConsDemo1(int i){
		System.out.println("������ ȣ���");
	}
	
	// ������ �ִ� �޼ҵ� �ڵ� �߰� *�⺻ ������
	ConsDemo1(){
	}
}

public class ConsTest1 {
	public static void main(String[] args) {
		new ConsDemo1(10);
		new ConsDemo1();
	}
}