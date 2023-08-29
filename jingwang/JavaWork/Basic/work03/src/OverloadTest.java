public class OverloadTest{
	void display(){
		System.out.println("기본 출력 내용");
	}
	
	void display(int i){
		System.out.println("i=" + i);
	}
	
	void display(double d){
		System.out.println("d=" + d);
	}
	
	void display(double d, int j){
		System.out.println("d=" + d + ", j=" + j);
	}
	
	
	public static void main(String[] args){
		OverloadTest test = new OverloadTest();
		
		test.display(100);
		test.display();
		test.display(3.14, 200);
		test.display(100.0);
	}
}