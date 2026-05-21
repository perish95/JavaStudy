package ex_design_pattern;

public class Outer {
  private String msg = "인스턴스 메시지";
  private static String staticMsg = "정적 메시지";

  // 그냥 inner class보다는 static inner class를 추천
  /*
   * class Inner {
   * void print() {
   * System.out.println(msg);
   * System.out.println(staticMsg);
   * }
   * }
   */

  static class StaticInner {
    void print() {
      // static이 아닌 msg는 사용 불가
      System.out.println(staticMsg);
    }

  }
}
