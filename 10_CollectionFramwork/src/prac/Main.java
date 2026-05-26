package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*** 1 ***/
    List<Integer> scores = new ArrayList<>(Arrays.asList(85, 92, 78, 100, 95));
    System.out.println("점수 리스트: " + scores);
    int sum = 0;
    for (Integer num : scores) {
      sum += num;
    }
    System.out.println("총점: " + sum);
    double res = sum / scores.size();
    System.out.println("평균 : " + res);

    /*** 2 ***/
    Map<String, String> dict = new HashMap<>(Map.of(
        "apple", "사과",
        "banana", "바나나",
        "computer", "컴퓨터",
        "dream", "꿈",
        "elite", "뛰어난 사람"));
    Scanner sc = new Scanner(System.in);
    String findKey = sc.next();

    if (dict.containsKey(findKey)) {
      System.out.println(findKey + "뜻은 " + dict.get(findKey) + "입니다.");
    } else
      System.out.println(findKey + "은(는) 단어장에 없는 단어입니다.");
  }
}
