class EmpManager {
	String name;
	int no;
	private double pay;

	// private로 막혀있는 변수의 값을 집어 넣을 수 있게
	// setter method 
	void setPay(double pay) {
		this.pay = pay;
	}
	// private로 막혀있는 변수의 값을 조회할 수 있게
	// getter method
	double getPay() {
		return pay;
	}
}

public class AccessModifierTest {

	public static void main(String[] args) {
		// TODO 접근 제한자 연습
		EmpManager hong = new EmpManager();
		hong.name = "홍길동";
		hong.no = 123;
		hong.setPay(100000);

		System.out.println(hong.name + ", " + hong.no
				+ ", " + hong.getPay());
	}

}
