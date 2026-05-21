package ex02_override;

public class Main {
  public static void main(String[] args) {
    Coffee coffee;
    Espresso espresso = new Espresso("A");
    Americano americano = new Americano("B");

    coffee = americano;
    

  }
}
