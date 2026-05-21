package ex05_this;

public class Car {
  int oil;

  Car() {
  }

  Car(int oil) {
    this.oil = oil;
  }

  void addOil(int oil) {
    if (oil < 0)
      return;

    this.oil += oil;
  }
}
