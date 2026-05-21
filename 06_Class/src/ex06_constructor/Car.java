package ex06_constructor;

public class Car {
  String model;

  public Car() {

  }

  public Car(String model) {
    this.model = model;
    System.out.println(model);
  }

}
