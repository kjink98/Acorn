package bytestream;

import java.io.Serializable;

// java.io.NotSerializableException 오류 : 직렬화해야함
// 데이터를 바이트로 쪼개서 단순하게 주고받을 수 있게 처리
public class Employee implements Serializable {
	private int no;
	private String name;
	private String job;
	private int deptno;
	private double sal;
	
	public Employee(int no, String name, String job, int deptno, double sal) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.deptno = deptno;
		this.sal = sal;
	}
	 // 원하는 대로 출력할 수 있게 오버라이딩. toString은 모든 클래스의 부모 Object의 메서드
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + job + "\t" + deptno + "\t" + sal;
	}
		
	
	
}
