package ex01_try_catch;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    // boolean flag = true;

    while (true) {
      try {
        System.out.println("첫 번째 숫자 입력");
        a = sc.nextInt();

        System.out.println("첫 번째 숫자 입력");
        b = sc.nextInt();

        System.out.println("몫:" + (a / b) + ", 나머지:" + (a % b));
      } catch (Exception e) {
        // flag = false;
        sc.nextLine(); // 버퍼 비우기
        // 주요 메서드 : getMessage(), printStackTrace()
        System.err.println("예외사유: " + e.getMessage());
        e.printStackTrace();
      }
    }

  }
}
