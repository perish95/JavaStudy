package ex01_stringbuilder;

public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Java");

    sb.append(" study");
    sb.insert(4, " script");
    sb.delete(4, 11);
    sb.replace(0, 4, "python");
    sb.reverse();
    String res = sb.toString();
    System.out.println(res);
    
  }
}
