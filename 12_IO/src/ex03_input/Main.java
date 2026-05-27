package ex03_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Main {
  public static void main(String[] args) {
    File dir = new File("/storage");
    File file = new File(dir, "text.txt");

    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {
      // 어떤 단위로 읽을 것인지 결정(int, byte[]) -> byte[] 배열 권장
      // 안 깨지는 한글을 받고 싶으면 byte기반이 아닌 문자기반으로 바꾸면 된다.(노션참고)
      // 문자냐 아니냐에 따라 선택
      byte[] b = new byte[6];
      int readByte = 0;

      while ((readByte = bis.read(b)) != -1) {
        // 실제로 읽은 바이트 수 만큼 처리
        System.out.println(new String(b, 0, readByte));
      }

    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
