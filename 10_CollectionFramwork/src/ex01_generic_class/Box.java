package ex01_generic_class;

//제네릭 클래스
//정해지지 않은 타입 T를 사용 <- 객체 생성 시점에 타입이 구체화됨
//<>안에 2개 이상도 가능하다.

public class Box<T> {
  private T content;

  // getter
  public T getContent() {
    return content;
  }

  // setter
  public void setContent(T content) {
    this.content = content;
  }

}
