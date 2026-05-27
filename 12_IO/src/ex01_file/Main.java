package ex01_file;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // 자바 홈을 파일 객체로 생성하기
    File javaHome = new File("C:\\Program Files\\Java\\jdk-21");

    // 기본 정보 확인
    System.out.println("이름: " + javaHome.getName());
    System.out.println("절대 경로: " + javaHome.getAbsolutePath());
    System.out.println("상대 경로: " + javaHome.getPath());
    System.out.println(javaHome.isDirectory() ? "디렉토리" : "파일");
    System.out.println("크기: " + javaHome.length() + "Byte");
    System.out.println("최종수정일: " + javaHome.lastModified());

    File[] files = javaHome.listFiles();
    Arrays.stream(files)
        .filter(f -> f.isFile())
        .forEach(f -> System.out.println(f.getName() + " " + f.length()));

    // 디렉터리 조작(생성, 삭제)
    File dir = new File("C:\\JavaStudy\\io_test");
    if (dir.exists()) {
      System.out.println(dir.getAbsolutePath() + " 존재합니다.");
    } else {
      dir.mkdir();
      System.out.println(dir.getAbsolutePath() + " 생성했습니다.");
    }

    dir.delete(); // 단 비워진 폴더만 지우기 가능
  }
}
