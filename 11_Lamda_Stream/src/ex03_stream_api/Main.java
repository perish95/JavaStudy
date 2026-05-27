package ex03_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    // 원본
    List<String> members = Arrays.asList("ss", "asdwasd", "asddd", "w");

    // 원본 리스트를 이용해 Stream생성
    Stream<String> stream = members.stream();

    // 최종 연산
    // stream.forEach((member) -> System.out.println(member));

    // 중간 연산 + 최종 연산
    // 최종 연산에서 stream을 사용해서 다시 사용하면 에러가 발생
    List<String> res = stream.filter(m -> m.length() <= 4)
        .map(String::toUpperCase)
        .map(m -> m + "님")
        .collect(Collectors.toList());

    System.out.println(res);
  }
}
