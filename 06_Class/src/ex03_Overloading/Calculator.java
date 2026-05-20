package ex03_Overloading;

class Main {
  public static void main(String[] args) {
    Calculator myCalc = new Calculator();

    myCalc.add(1.5, 2.5);
    myCalc.add(1, 2);
    myCalc.multiply(2, 3, 4);
  }
}

public class Calculator {
  void add(int a, int b) {
    System.out.println(a + b);
  }

  void add(double a, double b) {
    System.out.println(a + b);
  }

  /**
   * 최소 2개의 인자가 필요함, 이렇게하면 불필요한 오버로딩은 줄일 수 있다.
   * 
   * @param a       num1, 최소의 숫자1
   * @param b       num2, 최소의 숫자2
   * @param numbers 그 이후의 곱셈숫자들
   */
  void multiply(int a, int b, int... numbers) {
    int res = a * b;
    for (int i : numbers) {
      res *= i;
    }
    System.out.println(res);
  }
}
