package ex03_polymorphism;

public class Coffee {
  public String name = "Coffee";
  private String coffeeBean;

  public Coffee(String coffeeBean) {
    this.coffeeBean = coffeeBean;
  }

  public void taste() {
    // System.out.println("커피");
  }

  public void info() {
    System.out.println("원산지 " + coffeeBean);
  }

  
}
