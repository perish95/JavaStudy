package ex01_extends;

public class WebDeveloper extends Developer {

  public void webDevelop() {
    System.out.println("웹 개발");
  }

  public WebDeveloper(String name, String skill) {
    super(name, skill);
  }

}
