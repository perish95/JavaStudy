package ex01_extends;

//자식 생성자는 부모 생성자를 호출해야 한다.(강제) -> 부모가 태어나야 자식이 태어날 수 있다.
//super();
public class Developer extends Person {
  private String skill;

  public void develop() {
    System.out.println("개발하기");
  }

  public Developer(String name, String skill) {
    super(name); // person(부모 클래스)의 생성자를 의미
    this.skill = skill;
  }
}
