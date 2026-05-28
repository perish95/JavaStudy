package ex05_synchronize;

public class SyncMain {
  public static void main(String[] args) throws InterruptedException {
    SharedData sd = new SharedData();

    Thread t1 = new Thread(sd::consume);
    t1.start();

    new Thread(() -> {
      try {
        Thread.sleep(2000);
      } catch (Exception e) {
        e.printStackTrace();
      }
      sd.produce("따끈한 데이터");
    }).start();

  }
}
