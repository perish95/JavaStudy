package ex03_polymorphism;

public class Main {
  public static void main(String[] args) {
    Coffee coffee1 = new Espresso("A"); // 업캐스팅
    Coffee coffee2 = new Americano("B");// 업캐스팅 (자동으로 해줌)

    coffee1.taste();
    

    if (coffee1 instanceof Espresso) {
      Espresso espresso = (Espresso) coffee1;
      espresso.taste();
      espresso.myName();
      espresso.drink();
    }
  }
}
