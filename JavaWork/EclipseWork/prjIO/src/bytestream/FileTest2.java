package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
   public static void main(String[] args) throws IOException {
      // TODO 키보드로부터 입력받아 파일로 출력
      FileOutputStream fout = new FileOutputStream("C:\\jingwang\\JavaWork\\Test\\test3.txt");
      
      int input = 0;
      while(true) {
         input = System.in.read();
         
         if(input == -1) {
            break;
         }
         fout.write((char)input);
         fout.flush();
      }
      fout.close();
   }
}

/*
*  java Jcopy a.txt b.txt
*  java에서 Jcopy클래스를 만들어서 a텍스트를 b텍스트로 복사하는 프로그램
*/