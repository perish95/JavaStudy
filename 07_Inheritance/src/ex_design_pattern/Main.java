package ex_design_pattern;

public class Main {
  public static void main(String[] args) {
    // Factory 구조 연습
    /*
     * User user = UserFactory.newInstance(1, "Lee");
     * user.print();
     */

    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println(s1 == s2);

    /*
     * Outer outer = new Outer();
     * 
     * Outer.Inner inner = outer.new Inner(); //내부 클래스의 인스턴스 생성
     * inner.print();
     */

    Outer.StaticInner inner = new Outer.StaticInner();
    inner.print();

    Computer com = new Computer.Builder()
        .cpu("i7")
        .ram("16g")
        .storage("100g")
        .build();
    com.print();
  }
}
