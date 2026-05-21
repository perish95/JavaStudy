package ex01_extends;

public class Teacher extends Person {
  private String school;

  public void teach() {
    System.out.println("가르치기");
  }

  public Teacher(String name, String school) {
    super(name);
    this.school = school;
  }

}
