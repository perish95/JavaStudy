package ex04_return;

public class Calculator {
  int add(int a, int b) {
    return a + b;
  }

  void add(double a, double b) {
    if (a < 0 || b < 0)
      return;

    System.out.println(a + b);
  }
}
