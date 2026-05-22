package ex03_markerinterface;

interface Recyclable {
}

class Trash {
}

class Paper extends Trash implements Recyclable {
}

class Steel extends Trash implements Recyclable {
}

class Ballpen extends Trash {
}

public class Recycle {
  public void recycle(Object obj) {
    if (obj instanceof Recyclable) {
      System.out.println("재활용합니다.");
    } else {
      System.out.println("버릴게여");
    }
  }
}
