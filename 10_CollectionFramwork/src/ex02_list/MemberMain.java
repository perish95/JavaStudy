package ex02_list;

import java.util.*;

public class MemberMain {
  public static void main(String[] args) {
    List<Member> members = new ArrayList<>();

    members.add(new Member("지수", 20));
    members.add(new Member("로제", 22));
    members.add(new Member("제니", 24));
    members.add(new Member("리사", 26));
    System.out.println(members.get(0));

    // 4. 요소 삭제
    boolean isRemoved = members.remove(new Member("지수", 20));
    System.out.println(isRemoved ? "삭제 성공" : "삭제 실패");

    // 5. 요소 존재여부 확인
    Member target = new Member("지수", 20);
    if (members.contains(target))
      System.out.println("있");
    else
      System.out.println("없");

    for (Member mem : members) {
      System.out.println(mem);
    }
  }
}
