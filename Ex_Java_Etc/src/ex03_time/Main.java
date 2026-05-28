package ex03_time;

import java.time.*;

public class Main {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalTime now = LocalTime.now();
    LocalDateTime current = LocalDateTime.now();
    ZonedDateTime local = ZonedDateTime.now();

    System.out.println(today + " " + now);
    System.out.println(current + " " + local);

    LocalDate birthday = LocalDate.of(1995, 5, 25);
    LocalTime wakeUp = LocalTime.of(7, 30, 0);
  }
}
