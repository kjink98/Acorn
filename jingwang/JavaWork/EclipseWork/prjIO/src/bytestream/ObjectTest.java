package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee[] emp = new Employee[3];
		emp[0] = new Employee(1, "홍길동", "영업", 3, 3500);
		emp[1] = new Employee(2, "임꺽정", "기술", 2, 2500);
		emp[2] = new Employee(3, "Tommy", "개발", 1, 3000);
		
		// 파일 저장. dat : 이진 데이터 저장 확장자   
		// ObjectOutputStream은 파일 저장능력없으니 FileOutputStream의 도움받음
		// ObjectOutputStream 객체로 묶을 수 있도록
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\jingwang\\JavaWork\\Test\\emp.dat")
		);
		oos.writeObject(emp[0]);
		oos.writeObject(emp[1]);
		oos.writeObject(emp[2]);
		
		//java.io.NotSerializableException 오류 : 직렬화해야함
		oos.close();
		
		System.out.println("******************* 사원 정보 *****************");
		System.out.println("사번\t이름\t업무\t부서번호\t급여");
		System.out.println("---------------------------------------------");
		
		// 읽어오기
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\jingwang\\JavaWork\\Test\\emp.dat")
		);
		for(int i = 0; i<3; i++) {
			// employee 의 객체를 불러와서 읽는다. employee와 타입 맞춰주기 
			Employee e = (Employee)ois.readObject();
			System.out.println(e);
		}
		
		ois.close();
		
	}

}
