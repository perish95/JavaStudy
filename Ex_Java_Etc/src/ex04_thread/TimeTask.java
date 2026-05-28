package ex04_thread;

public class TimeTask implements Runnable {

  @Override
  public void run() {
    for(int i=0;i<=5;i++){
      System.out.println("타이머 " + i + "초...");
      try {
        Thread.sleep(1000); //1초 정지
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
  }
  
}
