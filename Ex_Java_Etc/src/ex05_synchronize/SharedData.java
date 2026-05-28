package ex05_synchronize;

public class SharedData {
  private String data;
  private boolean isEmpty = true;

  public synchronized void consume() {
    while (isEmpty) {
      try {
        System.out.println("[소비자] 창고가 비었습니다. 대기합니다...");
        wait();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    System.out.println("[소비자] 데이터를 소비함: " + data);
    isEmpty = true;
    notify();
  }

  public synchronized void produce(String newData) {
    while (!isEmpty) {
      try {
        System.out.println("[생산자] 창고가 가득 찼습니다. 대기합니다...");
        wait();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    this.data = newData;
    isEmpty = false;
    System.out.println("[생산자] 데이터를 생산함: " + newData);
    notify();
  }
}
