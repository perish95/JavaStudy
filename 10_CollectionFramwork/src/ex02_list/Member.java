package ex02_list;

import java.util.Objects;

import lombok.*;

@AllArgsConstructor // 생성자
@Getter // getter
@Setter // setter
@ToString // tostring
@EqualsAndHashCode // equals and hashcode

public class Member {
  private String name;
  private int age;
}
