package ex03_stream_api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Lombok 이용해 Boilerplate 채우기 constructor, getter, setter, tostring
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Article {
  private String title;
  private int viewCount;
}
