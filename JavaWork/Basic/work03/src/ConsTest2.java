class ConsDemo2{
	int iVal;
	double dVal;
	
	// 방법2
	ConsDemo2(int i, double d){
		iVal = i;
		dVal = d;
	}
	
	// 방법 1
	void setVal(int i, double d){
		/*
			검증 코드
		*/
		iVal = i;
		dVal = d;
	}
	
	// 기본 생성자
	ConsDemo2(){}
}

public class ConsTest2 {
	public static void main(String[] args) {
		// 기본 생성자
		ConsDemo2 ob = new ConsDemo2();
		System.out.println(ob.iVal);
		
		// 초기화 안되서 오류
		//int i;
		//System.out.println(i);
		
		// 변수 이름을 꺼내는 보안성의 문제와
		// 데이터를 검증하고 저장하는 조심성이 필요한데
		// 그런 조심성 없이 변수에 직접 접근해 바로 저장하니 문제가 됨
		//ob.iVal = 100;
		//ob.dVal = 10.0;
		
		// 검증 코드 작성
		/*
			100이 문제가 있는지 검증하는 코드
			하지만 변수를 집어넣을 때마다 계속 할 수 없으니
			메소드를 만들어 호출하는 방식을 사용
		*/
		
		// 방법1
		ob.setVal(100, 10.0);
		
		// 방법2
		ConsDemo2 ob2 = new ConsDemo2(100, 10.0);
	}
}