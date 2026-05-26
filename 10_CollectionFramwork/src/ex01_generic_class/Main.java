package ex01_generic_class;

public class Main {
  public static void main(String[] args) {
    Box<String> sBox = new Box<>(); // String으로 타입이 결정된 이후에는 문법적으로 String만 지원함
    Box<Integer> iBox = new Box<>();

    sBox.setContent("HI");
    System.out.println(sBox.getContent());

    iBox.setContent(10);
    System.out.println(iBox.getContent());
  }
}
