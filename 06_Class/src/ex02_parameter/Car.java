package ex02_parameter;

public class Car {
  int oil;

  /**
   * 운전하기
   * 
   * @param city 도시 이름
   */
  // void drive(String city) {
  // System.out.println(city + "에서 드라이브하기");
  // }

  void drive(String driver, String... cities) {
    oil -= 10;
    System.out.println("운전자 : " + driver);
    for (String str : cities) {
      System.out.println(str + "에서 드라이브하기");
    }
  }

  void goToGasStation(int fuel) {
    oil += fuel;
    System.out.println("현재 연료량 : " + oil);
  }
}
