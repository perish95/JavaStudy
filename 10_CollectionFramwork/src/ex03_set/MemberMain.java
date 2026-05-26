package ex03_set;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {
  public static void main(String[] args) {
    Set<Member> members = new HashSet<>();

    members.add(new Member("지수", 20));
    members.add(new Member("지수", 20));
    members.add(new Member("제니", 24));
    members.add(new Member("로제", 20));
    members.add(new Member("리사", 20));
    members.add(new Member("지수", 20));

    for (Member member : members) {
      System.out.println(member);
    }
  }
}
