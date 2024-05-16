import java.util.Scanner;

public class Challenges {
  public static void challenge1() {
    System.out.println("DDDD  H   H");
    System.out.println("D   D H   H");
    System.out.println("D   D H   H");
    System.out.println("D   D HHHHH");
    System.out.println("D   D H   H");
    System.out.println("D   D H   H");
    System.out.println("DDDD  H   H");
  }

  public static void challenge2() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello. I\'m Javabot. What is your name?");
    String name = scanner.nextLine();

    System.out.println("\nHello " + name + ". Where are you from?");
    String locale = scanner.nextLine();

    System.out.println("\nI hear it\'s beautiful in " + locale + ". I would love to visit some day. I'm from a place called Oracle.");
    System.out.println("\nHow old are you?");
    int age = scanner.nextInt();

    int javabotAge = 400;
    System.out.println("\nSo you\'re " + age + "! I am " + javabotAge + ". That makes me " + (javabotAge / age) + " times older than you!");

    System.out.println("\nThat\'s enough about me. What is your favorite language? Just don\'t say Python...");
    scanner.nextLine();
    String language = scanner.nextLine();

    String languageResponse = language.toLowerCase().equals("python") ? "Ew, you should try Java :D" : "That's a good choice!";
    System.out.println("\n" + languageResponse);

    System.out.println("\n\nIt was nice chatting with you " + name + ". I have to log off now.");
    System.out.println("\nTil next time!");

    scanner.close();
  }

  public static void challenge3() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("*****TRIVIA CHALLENGE*****");
    String question1 = "c";
    String question2 = "a";
    String question3 = "d";
    String question4a = "a";
    String question4b = "b";

    System.out.println("1. Which country held the 2016 Summer Opympics?");
    System.out.println("\ta: China");
    System.out.println("\tb: Ireland");
    System.out.println("\tc: Brazil");
    System.out.println("\td: Italy");
    String answer1 = scanner.nextLine().toLowerCase(); // Correct: C

    System.out.println("2: Which planet is the hottest?");
    System.out.println("\ta: Venus");
    System.out.println("\tb: Saturn");
    System.out.println("\tc: Mercury");
    System.out.println("\td: Mars");
    String answer2 = scanner.nextLine().toLowerCase(); // Correct: A

    System.out.println("3: What is the rarest blood type?");
    System.out.println("\ta: O");
    System.out.println("\tb: A");
    System.out.println("\tc: B");
    System.out.println("\td: AB-Negative");
    String answer3 = scanner.nextLine().toLowerCase(); // Correct: D

    System.out.println("4: Which of these characters are friends with Harry Potter? Choose any correct answer.");
    System.out.println("\ta: Ron Weasly");
    System.out.println("\tb: Hermione Granger");
    System.out.println("\tc: Draco Malfoy");
    String answer4 = scanner.nextLine().toLowerCase(); // Correct: A or B

    int score = 0;
    if (answer1.equals(question1)) {
      score += 5;
    }
    if (answer2.equals(question2)) {
      score += 5;
    }
    if (answer3.equals(question3)) {
      score += 5;
    }
    if (answer4.equals(question4a) || answer4.equals(question4b)) {
      score += 5;
    }

    switch (score) {
      case 0:
        System.out.println("You scored " + score + "/20. Try again after studying.");
        break;
      case 5:
        System.out.println("You scored " + score + "/20. You can do better than this.");
        break;
      case 10:
        System.out.println("You scored " + score + "/20. Half way to a perfect score.");
        break;
      case 15:
        System.out.println("You scored " + score + "/20. Great job!");
        break;
      case 20:
        System.out.println("You scored " + score + "/20. Perfect score!!!");
        break;
      default:
        System.out.println("An Error occurred. Please try again.");
    }
  }

  public static void main(String[] args) {
    // challenge1();
    // challenge2();
    challenge3();
  }
}