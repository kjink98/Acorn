import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) {
		// TODO java.text.DecimalFormat
		double d1 = 2.523, d2 = 3.123;
		double result = d1 + d2;
		System.out.println(result);
		
		DecimalFormat df = new DecimalFormat("#.##");
//		System.out.println(df.format(result)); // return 값은 StringBuffer 타입
		String strResult = df.format(result);
		System.out.println(strResult);
		
//		double doubleResult = (double)strResult; // 캐스팅은 기본 타입에서만 가능
//		(double)은 비객체, strResult는 객체
//		wrapper class 비객체를 객체화
		double doubleResult = Double.parseDouble(strResult);
		System.out.println(doubleResult);
	}

}
