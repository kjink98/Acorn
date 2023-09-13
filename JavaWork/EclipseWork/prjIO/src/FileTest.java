import java.io.File;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		// TODO File 클래스
		File f = new File("C:\\jingwang\\JavaWork\\Test\\emp.dat");
		
		// 파일이 존재한다면
		if(f.exists()) {
			System.out.println("파일의 이름 : " + f.getName());
			System.out.println("상대경로 : " + f.getPath());
			System.out.println("절대경로 : " + f.getAbsolutePath());
			System.out.println("크기 : " + f.length() + "byte");
			System.out.println("마지막 수정일자 : " + new Date(f.lastModified()));
		}
		else {
			System.out.println("파일이 존재 하지 않습니다.");
		}
		
		f.delete();
	}

}
