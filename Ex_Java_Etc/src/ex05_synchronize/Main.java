package ex05_synchronize;

class Counter {
  int count = 0;

  // 동기화가 없는 메서드
  public void increment() {
    count++;
  }
}

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    Runnable task = () -> {
      for (int i = 0; i < 1000; i++) {
        counter.increment();
      }
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();
    t1.join(); // t1이 끝날 때까지 대기
    t2.join(); // t2가 끝날 때까지 대기

    // try {
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // 기대값은 2000이지만, 실제 결과는 그보다 작음
    System.out.println("최종 결과: " + counter.count);
  }
}
