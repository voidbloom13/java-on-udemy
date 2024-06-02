import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
  public static String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel", "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};
  
  public static Character[][] selectWord() {
    int random = (int) (Math.random() * words.length);
    String randomWord = words[random];
    Character[] selectedWord = new Character[randomWord.length()];
    Character[] guessedWord = new Character[randomWord.length()];

    for (int i = 0; i < randomWord.length(); i++) {
      selectedWord[i] = randomWord.charAt(i);
      guessedWord[i] = '_';
    }

    Character[][] wordDB = {selectedWord, guessedWord};

    return wordDB;
  }

  public static void displayGallows(int incorrectGuesses) {
    switch (incorrectGuesses) {
      case 0 -> System.out.println("""
          
          """);
      case 1 -> System.out.println("""
          Head
      """);
      case 2 -> System.out.println("""
          Head Chest
      """);
      case 3 -> System.out.println("""
          Head Chest Arm
      """);
      case 4 -> System.out.println("""
          Head Chest Arm Arm
      """);
      case 5 -> System.out.println("""
          Head Chest Arm Arm Leg
      """);
      case 6 -> System.out.println("""
          Head Chest Arm Arm Leg Leg
      """);
      default -> System.out.println("Something went wrong...");
    }
  }

  public static char guess() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Guess: ");
    char guess = scan.nextLine().charAt(0);
    return guess;
  }

  public static Character[][] validateGuess(char guess, Character[][] wordDB) {
    for (int i = 0; i < wordDB[0].length; i++) {
      if (wordDB[0][i] == guess) {
        wordDB[1][i] = guess;
      }
    }

    return wordDB;
  }

  public static void main(String[] args) {
    Character[][] wordDB = selectWord();
    Character[][] wordDB_copy = new Character[wordDB.length][wordDB[0].length];
    ArrayList<Character> guesses = new ArrayList<>();
    int incorrectGuesses = 0;

    while (incorrectGuesses < 6) { // GAME LOOP
      // for loop to copy wordDB to wordDB_copy
      for (int i = 0; i < wordDB[1].length; i++) {
        wordDB_copy[1][i] = wordDB[1][i];
      }

      System.out.println("\n\n\n*********************************\n");
      
      displayGallows(incorrectGuesses);
      
      System.out.print("WORD: ");
      for (Character character : wordDB[1]) {
          System.out.print(character + " ");
      }
      System.out.print("\n");
      
      System.out.print("GUESSES: ");
      for (Character guess : guesses) {
        System.out.print(guess + " ");
      }
      System.out.print("\n");
      
      char guess = guess();
      wordDB = validateGuess(guess, wordDB); 
      
      if (Arrays.equals(wordDB[1], wordDB_copy[1])) {
        incorrectGuesses++;
        guesses.add(guess);
      }

      if (Arrays.equals(wordDB[0], wordDB[1])) {
        break;
      }

      System.out.println("\n*********************************\n\n\n");
    }

    displayGallows(incorrectGuesses);
    System.out.print("WORD: ");
    for (int i = 0; i < wordDB[0].length; i++) {
      System.out.print(wordDB[0][i]);
    }

    if (incorrectGuesses < 6) {
      System.out.println("\n YOU WIN");
    } else {
      System.out.println("\n YOU LOSE");
    }
  }
}