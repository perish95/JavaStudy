package ex04_thread;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("MyThread 동작중");
  }

}
