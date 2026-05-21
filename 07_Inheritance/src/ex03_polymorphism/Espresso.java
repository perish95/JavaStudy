package ex03_polymorphism;

public class Espresso extends Coffee {

  public Espresso(String coffeeBean) {
    super(coffeeBean);
  }

  @Override
  public void taste() {
    System.out.println("쓴 맛");
  }

  @Override
  public void info() {
    System.out.println("에스프레소");
    super.info(); // 부모(coffee의 info)
  }

  // coffee에 없는 espresso 전용 메서드
  public void drink() {
    System.out.println("에스프레소 마시기");
  }

  public void myName() {
    System.out.println(name);
  }
}
