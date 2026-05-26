package ex02_list;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // 배열 리스트 Arraylist

    List<String> members = new ArrayList<>();

    members.add("지수");
    members.add("제니");
    members.add("리사");
    members.add("로제");

    System.out.println(members);
    System.out.println(members.get(0));

    System.out.println(members.size());

    String temp = members.remove(0);
    System.out.println(temp);
    boolean flag = members.remove("지수");
    System.out.println(flag ? "참" : "거짓");
    temp = "유나";
    if (members.contains(temp)) {
      System.out.println("잇다");
    } else {
      System.out.println("없다");
    }

    for (String m : members) {
      System.out.println(m);
    }

    // len자리에 member.size()을 하면 member.size()를 매번 호출하는 비효율적인 코드
    // 길이를 앞에 선언부에 같이 선언하면 단 1회만 호출 -> 효율적
    for (int i = 0, len = members.size(); i < len; i++) {
      System.out.println(members.get(i));
    }
  }

}
