package ex02_standard_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//매개변수가 함수형 인터페이스인 경우: 람다식을 전달한다.

public class Main {
  public static void main(String[] args) {
    executeConsumer("ssss", name -> System.out.println("이름: " + name));
    executeSupplier(() -> "ㅑㅗㅑㅗ");
    executeFunction("ssss", name -> name.length());
    executePredicate(-5, num -> num > 0);
  }

  /**
   * 
   * @param param 람다식에 전달할 값
   * @param pred  값을 받아서 참, 거짓 판별
   */
  public static void executePredicate(int param, Predicate<Integer> pred) {
    boolean flag = pred.test(param);
    System.out.println(flag);
  }

  /**
   * 
   * @param param 람다식에 전달할 매개변수
   * @param func  input, output이 있는 람다식
   */
  public static void executeFunction(String param, Function<String, Integer> func) {
    int res = func.apply(param);
    System.out.println(res);
  }

  /**
   * 
   * @param supplier 값을 반환하는 함수(람다식)
   */
  public static void executeSupplier(Supplier<String> supplier) {
    String res = supplier.get();
    System.out.println(res);
  }

  /**
   * Consumer 예제
   * 
   * @param param 매개변수
   * @consumer consumer param을 사용하는 람다식
   */
  public static void executeConsumer(String param, Consumer<String> consumer) {
    consumer.accept(param);
  }
}
