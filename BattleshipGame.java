import java.util.Scanner;
import java.util.Arrays;

class BattleshipGame {

  public static void main(String [] args) {

    System.out.println("Let's play Battleship!");
    System.out.println("The ship stretches across 3 cells in a row with cells 0-7.");
    System.out.println("Make guesses one cell at a time to try to sink the ship!");

    Battleship battleship = new Battleship();
    boolean isSunk = false;

    // Randomly chooses an integer between 0-4 and creates three consecutive cells for battleship
    int firstCell = (int) (Math.random() * 6);
    int[] locationCellsArray = new int[] {firstCell, firstCell + 1, firstCell + 2};
    battleship.setLocationCells(locationCellsArray);
    String stringArray = Arrays.toString(locationCellsArray);
    System.out.println("Random, secret location of battleship: " + stringArray);

    System.out.println("The battleship has been placed.");
    System.out.println("What is your first guess?");

    battleship.checkGuess();

  }

}
