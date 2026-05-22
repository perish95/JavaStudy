package ex01_abstract;

public class Main {
  public static void main(String[] args) {
    Game game = new Tetris(); 

    game.play();
    game = new Pinball();
    game.play();
  }
}
