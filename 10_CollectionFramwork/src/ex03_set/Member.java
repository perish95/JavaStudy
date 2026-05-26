package ex03_set;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // 생성자
@Getter //getter
@Setter //setter
@ToString //tostring
@EqualsAndHashCode //equals and hashcode
public class Member {
  private String name;
  private int age;

  // public Member(String name, int age) {
  //   this.name = name;
  //   this.age = age;
  // }

  // public Member() {
  // }

  // public String getName() {
  //   return name;
  // }

  // public void setName(String name) {
  //   this.name = name;
  // }

  // public int getAge() {
  //   return age;
  // }

  // public void setAge(int age) {
  //   this.age = age;
  // }

  // @Override
  // public String toString() {
  //   return "Member [name=" + name + ", age=" + age + "]";
  // }

  // @Override
  // public boolean equals(Object o) {
  //   if (this == o)
  //     return true;

  //   if (!(o instanceof Member))
  //     return false;

  //   Member member = (Member) o;

  //   return age == member.age &&
  //       Objects.equals(name, member.name);
  // }

  // @Override
  // public int hashCode() {
  //   // TODO Auto-generated method stub   
  //   return Objects.hash(name, age);
  // }
}
