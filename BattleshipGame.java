import java.util.Scanner;
import java.util.Arrays;

class BattleshipGame {

  public static void main(String [] args) {

    System.out.println("Let's play Battleship!");
    System.out.println("The ship stretches across 3 cells in a row with cells 0-7.");
    System.out.println("Make guesses one cell at a time to try to sink the ship!");

    Battleship battleship = new Battleship();
    battleship.setLocationCells();

    System.out.println("The battleship has been placed.");
    System.out.println("What is your first guess?");

    battleship.checkGuess();

  }

}
