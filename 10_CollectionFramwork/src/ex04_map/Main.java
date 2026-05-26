package ex04_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Main {
  public static void main(String[] args) {
    // 1.객체생성
    Map<String, Object> map = new HashMap<>();

    // 2.Entry 저장(Key + Value => Entry)
    map.put("name", "홍길동");
    map.put("age", 30);
    map.put("hobies", new String[] { "러닝", "게임" });

    // 3.Entry 수정 put을 그대로 이용
    map.put("name", "김철수");

    // 4.정보 확인(Value 확인 => Key를 이용)
    System.out.println(map.get("name"));
    System.out.println(map.get("age"));
    // Obejct 사용 시의 주의사항(다운 캐스팅이 필요할 수 있다.)
    System.out.println(Arrays.toString((String[]) map.get("hobies")));
    System.out.println(map.getOrDefault("birthday", "생일 정보 없음"));

    // 5.Entry 순회1(Key를 이용한 순회 방식)
    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key + " " + map.get(key));
    }
    System.out.println();

    // 6.Entry 순회2 (Entry 인터페이스를 이용한 순회 방식 - 추천)
    for (Entry<String, Object> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // 7.Map.of()
    // 정적 팩토리 메서드 of(): new 대신 사용하는 객체 생성 메서드
    // 이렇게 만든 Map 객체는 수정 불가능 = Immutable:put, remove 사용 불가
    // 서버 단에서 클라이언트 단에 정보를 보낼 때 필요(안전하게 관리)
    Map<String, String> config = Map.of(
        "name", "홍길동",
        "age", "30");

    System.out.println(config);
  }
}
