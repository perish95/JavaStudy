package ex02_interface;

public class Main {
  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.fly();
    duck.swim();
  }
}

class Duck implements Flyable, Swimmable, Eatable {

  @Override
  public void fly() {
    System.out.println("Fly");
  }

  @Override
  public void swim() {
    System.out.println("Swim");
  }

  @Override
  public void eat() {
    System.out.println("Eat");

  }
}
