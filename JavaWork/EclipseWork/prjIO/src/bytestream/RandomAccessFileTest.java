package bytestream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO 임의 접근
		int data[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		RandomAccessFile raf = new RandomAccessFile("C:\\jingwang\\JavaWork\\Test\\test5.txt", "rw");
		
		for(int i = 0; i<10; i++) {
			raf.writeInt(data[i]);
		}
		
		raf.seek(0);
		System.out.println(raf.readInt());

		// 4바이트씩 3번째
		raf.seek(4*3);
		System.out.println(raf.readInt());
	}

}
