package ex01_lamda;

public class Main {
  public static void main(String[] args) {
    // 오버라이딩을 해준다면 인터페이스의 객체를 생성할 수 있다.
    // MyInterface my = new MyInterface() {
    // @Override
    // public void method() {
    // // TODO Auto-generated method stub

    // }
    // };

    // 이걸 람다식으로 바꿔준다.
    MyInterface my = () -> {
      System.out.println("Lamda");
    };
    my.method();

    MyInterface2 my2 = name -> {
      System.out.println(name + "입니다.");
    };
    my2.method("LKS");

    MyInterface3 my3 = () -> "hi";
    System.out.println(my3.method());

    Calculator calc = (a, b) -> a + b;
    System.out.println(calc.add(5, 2));

  }

}
