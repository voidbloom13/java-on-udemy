import java.util.Scanner;

public class Game1 {
  public static String computerChoice() {
    String[] choices = {"Rock", "Paper", "Scissors"};
    int choiceIndex = (int) Math.random() * 3;

    String choice = choices[choiceIndex];
    return choice;
  }

  public static String playerChoice() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Rock, Paper, Scissors, shoot!");
    System.out.println("\t1: Rock\n\t2: Paper\n\t3: Scissors");
    int playerChoiceInt = scan.nextInt();
    String playerChoiceString = "";

    switch (playerChoiceInt) {
      case 1:
        playerChoiceString = "Rock";
        break;
      case 2:
        playerChoiceString = "Paper";
        break;
      case 3:
        playerChoiceString = "Scissors";
        break;
      default:
        System.out.println("Oops. Something went wrong.");
    }

    return playerChoiceString;
  }

  public static void gameLogic(String computerChoice, String playerChoice) {
    if (computerChoice.equals(playerChoice)) {
      System.out.println("Tie");
    } else if (computerChoice.equals("Rock") && playerChoice.equals("Paper")) {
      System.out.println("Player wins");
    } else if (computerChoice.equals("Rock") && playerChoice.equals("Scissors")) {
      System.out.println("Computer wins");
    } else if (computerChoice.equals("Paper") && playerChoice.equals("Rock")) {
      System.out.println("Computer wins");
    } else if (computerChoice.equals("Paper") && playerChoice.equals("Scissors")) {
      System.out.println("Player wins");
    } else if (computerChoice.equals("Scissors") && playerChoice.equals("Rock")) {
      System.out.println("Player wins");
    } else if (computerChoice.equals("Scissors") && playerChoice.equals("Paper")) {
      System.out.println("Computer wins");
    } else {
      System.out.println("Oops, something went wrong.");
    }
  }

  public static void main(String[] args) {
    String computerChoice = computerChoice();
    String playerChoice = playerChoice();
    gameLogic(computerChoice, playerChoice);
  }
}