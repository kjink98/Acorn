class ThisDemo {
	int iVal;
	double dVal;
	
/*  ThisDemo(this, int i, double d)
	ThisDemo(int i, double d) {
		this.iVal = i;
		//this 생략 가능
		dVal = d;
	}*/
// 그러나 매개변수가 인스턴스 변수와 이름이 같은 경우 무조건 this
	ThisDemo(int iVal, double dVal) {
		this.iVal = iVal;
		this.dVal = dVal;
	}
	
	// void display(this)
	void display(){
		System.out.println(this.iVal + ", " + this.dVal);
	}
}
public class ThisTest {
	public static void main(String[] args){
//실인자 값: 	ThisDemo t1 = new ThisDemo(주소, 10, 10.5);
		ThisDemo t1 = new ThisDemo(10, 10.5);
		ThisDemo t2 = new ThisDemo(20, 20.5);
		ThisDemo t3 = new ThisDemo(30, 30.5);
		
		// t1.display(주소);
		t1.display();
		t2.display();
		t3.display();
	}
}