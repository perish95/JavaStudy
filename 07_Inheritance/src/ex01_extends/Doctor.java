package ex01_extends;

public class Doctor extends Person {
  private String hospital;

  public void operate() {
    System.out.println("수술하기");
  }

  public Doctor(String name, String hospital) {
    super(name);
    this.hospital = hospital;
  }

}
