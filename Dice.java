import java.util.Scanner;

public class Dice {
  static Scanner scan = new Scanner(System.in);

  public static int playerChoice() {
    System.out.println("In one line, choose 3 numbers between 1-6, separated by spaces: ");
    int playerChoice1 = scan.nextInt();
    int playerChoice2 = scan.nextInt();
    int playerChoice3 = scan.nextInt();
    
    int playerSum = playerChoice1 + playerChoice2 + playerChoice3;
    System.out.println("Your Sum: " + playerSum);
    return playerSum;
  }

  public static int diceRoll() {
    int diceRoll1 = (int) (Math.random() * 6) + 1;
    int diceRoll2 = (int) (Math.random() * 6) + 1;
    int diceRoll3 = (int) (Math.random() * 6) + 1;

    int diceRollTotal = diceRoll1 + diceRoll2 + diceRoll3;
    System.out.println("Dice Roll Total: " + diceRollTotal);
    return diceRollTotal;
  }

  public static boolean gameResults(int playerSum, int diceRollTotal) {
    boolean winCondition;
    if ((playerSum <= diceRollTotal) && (diceRollTotal - playerSum <= 3)) {
      winCondition = true;
    } else {
      winCondition = false;
    }
    return winCondition;
  }

  public static void main(String[] args) {
    int playerSum = playerChoice();
    int diceRollTotal = diceRoll();
    boolean gameResult = gameResults(playerSum, diceRollTotal);
    if (gameResult) {
      System.out.println("You win!");
    } else {
      System.out.println("Sorry, try again.");
    }
  }
}