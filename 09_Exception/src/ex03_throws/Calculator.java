package ex03_throws;

public class Calculator {
  /**
   * divide function
   * @param a
   * @param b 
   * @throws NumberFormatException don't use Integer
   */
  public static void div(String a, String b) throws NumberFormatException { //안 써도 되기는 함
    int x = Integer.parseInt(a);
    int y = Integer.parseInt(b);

    System.out.println("나누기:" + (x/y));
  }

  public static void mod(String a, String b){
    int x = Integer.parseInt(a);
    int y = Integer.parseInt(b);

    System.out.println("나머지:" + (x%y));
  }
}
