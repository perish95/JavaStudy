package ex07_encapsulation;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();

    car.setModel("G80");
    System.out.println(car.getModel());
  }
}
