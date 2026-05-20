package ex02_parameter;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();

    car.goToGasStation(50);

    car.drive("ks", new String[] { "Seoul", "Busan" });
    car.drive("ks", "NewYork");
    car.drive("Seoul");

    System.out.println("현재 연료량:" + car.oil);

  }
}
