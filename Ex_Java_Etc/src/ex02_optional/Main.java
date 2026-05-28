package ex02_optional;

import java.util.Optional;

import javax.management.RuntimeErrorException;

public class Main {
  private static String maybeNull() {
    if (Math.random() > 0.5)
      return null;
    else
      return "Hi";
  }

  public static void main(String[] args) {
    Optional<String> opt = Optional.ofNullable(maybeNull());

    String res1 = opt.orElse("Default");
    System.out.println(res1);

    String res2 = opt.orElseGet(() -> "Default from Lambda");
    System.out.println(res2);

    String res3 = opt.orElseThrow(() -> new RuntimeException("No data"));
    System.out.println(res3);
  }
}
