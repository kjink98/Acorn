package basic07;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	private String filePath;
	
	public void setFilePath(String path) {filePath = path; }
	
	@Override
	public void output(String msg) throws IOException {
		// 파일 객체 생성
		FileWriter writer = new FileWriter(filePath);
		// 파일 저장
		writer.write(msg);
		writer.close();
	}

}
