class Battleship {

  private int[] locationCells;

  public void setLocationCells() {
    
  }

  public void checkGuess() {
    String userGuessString = System.console().readLine();
    int userGuess = Integer.parseInt(userGuessString);
    System.out.println("Your guess was " + userGuess);
  }

}
