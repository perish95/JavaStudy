package ex02_throw;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("점수(0~100)를 입력하세요");
      int score = sc.nextInt();

      if (score < 0 || score > 100) {
        throw new RuntimeException(score + "점은 잘못된 입력입니다. 다시 시도하세요."); // 커스텀 예외처리 -> catch로 이동
      }

      System.out.println(score >= 60 ? "합격" : "불합격");

    } catch (Exception e) {
      System.err.println(e.getMessage());
    } finally {
      sc.close();
    }
  }
}
