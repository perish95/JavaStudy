package ex01_class;

//패키지를 명시 안 해도 되는 이유 3가지
//1. 같은 패키지 내에 존재
//2. java.lang(java의 가장 기본적인 패키지)에 있는 경우 (String, System)
//3. import문을 작성한 경우 

public class Main {
  public static void main(String[] args) throws Exception {
    Car car = new Car("G80", 8000);
    System.out.println(car.model + " " + car.price);
  }
}
