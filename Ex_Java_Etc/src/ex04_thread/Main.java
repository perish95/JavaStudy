package ex04_thread;

public class Main {
  public static void main(String[] args) {
    // MyThread thread = new MyThread();
    // thread.start();
    // Thread thread = new Thread(new MyRunnable());
    // thread.start();

    Runnable alphabetTask = () -> {
      for (char c = 'A'; c <= 'E'; c++) {
        System.out.println("알파벳: " + c);
        try {
          Thread.sleep(500);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    };
    Thread thread1 = new Thread(new TimeTask());
    Thread thread2 = new Thread(alphabetTask);

    System.out.println("---메인 스레드 시작---");
    thread1.start();
    thread2.start();
    System.out.println("---메인 스레드 종료");

  }
}
