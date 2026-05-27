package ex03_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleMain {
  public static void main(String[] args) {
    // 원본 리스트 생성
    List<Article> articles = Arrays.asList(
        new Article("오늘 날씨", 15),
        new Article("이란 전쟁", 150),
        new Article("Gtx 철근", 200),
        new Article("스타벅스", 50),
        new Article("지방 선거", 300));
    Stream<Article> stream = articles.stream();

    List<String> titles = stream.filter(a -> a.getViewCount() >= 100)
        .map(a -> a.getTitle())
        .collect(Collectors.toList());

    System.out.println(titles);
  }
}
