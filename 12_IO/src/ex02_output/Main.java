package ex02_output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main {
  public static void main(String[] args) {
    File dir = new File("/storage");

    if (!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "text.txt");

    // 파일로 데이터를 보내는 스트림:통로 (출력 스트림) ->int, byte[]
    // try 안에 선언과 할당을 넣어주면 close를 알아서 해줌
    // 나중에 close의 순서(열린 순서의 역순:LIFO)도 지켜야한다. 그래서 알아서 해주도록 하자
    // FileOutputStream 할당 시에 file 객체 옆에 boolean 값을 주면 덮어쓰기가 아닌 데이터가 추가된다.
    // FileOutputStream 성능이 좋지않기 때문에 buffer를 붙여서 사용한다. + 데코레이션 패턴
    try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(file, true));) {
      int c = 'A';
      byte[] b = "pple".getBytes();

      fos.write(c);
      fos.write(b);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
