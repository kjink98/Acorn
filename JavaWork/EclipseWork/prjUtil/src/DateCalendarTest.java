import java.util.Date;
import java.util.Calendar;

public class DateCalendarTest {

	public static void main(String[] args) {
		// TODO Date클래스와 Calendar 클래스의 차이점
		
//		************** Date 클래스
		Date date = new Date();
		System.out.println(date);
		System.out.println(new Date());
		System.out.println(new Date().toString()); // .toString()이 생략됨
		
		DateCalendarTest test = new DateCalendarTest();
		System.out.println(test.toString()); // 주소값 출력
		
//		************** Calendar 클래스
		Calendar cal = Calendar.getInstance(); // Singleton 패턴으로 만들어진 디자인 패턴(인스턴스가 하나)
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));
		
	}

}
