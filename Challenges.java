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

  public static void main(String[] args) {
    // challenge1();
    // challenge2();
  }
}