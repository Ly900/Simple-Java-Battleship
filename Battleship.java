import java.util.Arrays;

class Battleship {

  private int[] locationCells;

  public void setLocationCells(int[] loc) {
    locationCells = loc;
  }

  public void checkGuess() {

    boolean isFloating = true;
    int numGuesses = 0;
    int numHits = 0;

    while (isFloating) {
      String result = "Miss.";
      String userGuessString = System.console().readLine();
      int userGuess = Integer.parseInt(userGuessString);

      numGuesses++;

      for (int cell : locationCells) {
        if (userGuess == cell) {
          result = "Hit!";
          numHits++;
          break;
        }
      }

      System.out.println(result);

      if (numHits == 3) {
        System.out.println("Congrats! You've sunk the ship! It took you " + numGuesses + " guesses.");
        isFloating = false;
      } else if (numHits < 3) {
        System.out.println("What is your next guess?");
      }

    } // Ends while loop

  }

}
