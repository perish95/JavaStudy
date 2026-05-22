package ex03_markerinterface;

public class Main {
  public static void main(String[] args) {
    Trash[] arr = { new Paper(), new Steel(), new Ballpen() };
    Recycle rec = new Recycle();

    for (Trash trash : arr) {
      rec.recycle(trash);
    }
  }

}
