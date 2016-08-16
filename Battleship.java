import java.util.Arrays;

class Battleship {

  private int[] locationCells;

  // Randomly chooses an integer between 0-4 and creates three consecutive cells for battleship
  public void setLocationCells() {
    int firstCell = (int) (Math.random() * 6);
    int[] locationCellsArray = new int[] {firstCell, firstCell + 1, firstCell + 2};
    String stringArray = Arrays.toString(locationCellsArray);
    System.out.println(stringArray);
  }

  public void checkGuess() {
    String userGuessString = System.console().readLine();
    int userGuess = Integer.parseInt(userGuessString);
    System.out.println("Your guess was " + userGuess);
  }

}
