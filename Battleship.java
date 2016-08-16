import java.util.Arrays;

class Battleship {

  private int[] locationCells;

  public void setLocationCells(int[] loc) {
    locationCells = loc;
  }

  public void checkGuess() {
    String userGuessString = System.console().readLine();
    int userGuess = Integer.parseInt(userGuessString);
    System.out.println("Your guess was " + userGuess);

    for (int cell : locationCells) {
      if (userGuess == cell) {
        System.out.println("Hit!");
        break;
      } else {
        System.out.println("Miss.");
        break;
      }
    }

  }

}
