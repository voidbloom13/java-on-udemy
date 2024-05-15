import java.util.Scanner;

public class Workbooks {
  public static void workbook1_1() {
    System.out.println("Printing is fun!");
    System.out.println("Java > Python");
    System.out.println("I spilled Java all over my paper.");
    System.out.println("My dog ate my Java.");
  }

  public static void workbook2_1() {
    int points = 0;
    points -= 50;
    points -= 3;
    points += 30;
    points += 100;
    points += 60;
    System.out.println(points);
  }

  public static void workbook2_2() {
    String name = "Dakota";
    int age = 26;
    String country = "the USA";
    String sport = "bowling";
    int hours = 3;
    String game = "Final Fantasy 7 Remake";
    String subject = "Math";
    char grade = 'C';

    System.out.println("My name is " + name + ". I\'m " + age + " years old, and I\'m from " + country +".");
    System.out.println("My favorite sport is " + sport + ". I play for " + hours + " hours a day.");
    System.out.println("When I\'m tired, I like to play " + game + ".");
    System.out.println("In school, my favorite subject was " + subject + ", I scored a " + grade + ".");
  }

  public static void workbook2_3() {
    int numOfApples = 0;
    int numOfCustomers = 0;
    double profit = 0;

    System.out.println("You picked 500 apples from an apple orchard.");
    numOfApples += 500;

    System.out.println("Time for Business! You're selling each apple for 40 cents.");
    double price = 0.4;

    System.out.println("One customer walked in. He bought 4 apples.");
    numOfApples -= 4;
    numOfCustomers++;
    profit += (4 * price);

    System.out.println("Another customer walked in, he bought 20 apples.");
    numOfApples -= 20;
    numOfCustomers++;
    profit += (20 * price);

    System.out.println("Another customer walked in. She bought 200 apples!");
    numOfApples -= 200;
    numOfCustomers++;
    profit += (200 * price);

    System.out.println("Wow! So far, you made $" + profit);
    System.out.println(numOfCustomers + " customers love your apples.");
    System.out.println("You have " + numOfApples + " apples left.");
  }

  public static void workbook2_4() {
    double sales = 24309.65;
    double profit = 18652.18;
    double refunds = 688.78;
    double shipping = 1233.57;

    System.out.println("This month, we have made $" + (int) sales + " in sales.");
    System.out.println("Factoring in costs, we made $" + (int) profit + " in profit.");
    System.out.println("The refunds are at a low $" + (int) refunds + ". This is a good sign.");
    System.out.println("Shipping costs were high. We paid $" + (int) shipping + " in shipping.");
  }

  public static void workbook2_5() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your first name?");
    String firstName = scanner.nextLine();

    System.out.println("What is your last name?");
    String lastName = scanner.nextLine();

    System.out.println("What is your age?");
    int age = scanner.nextInt();

    System.out.println("Create a username.");
    scanner.nextLine(); // throwaway scanner;
    String username = scanner.nextLine();

    System.out.println("What city do you live in?");
    String city = scanner.nextLine();

    System.out.println("What country is that in?");
    String country = scanner.nextLine();

    System.out.println("Thank you.\nPlease review the following for errors:");
    System.out.println("\tFirst Name: " + firstName);
    System.out.println("\tLast Name: " + lastName);
    System.out.println("\tAge: " + age);
    System.out.println("\tUsername: " + username);
    System.out.println("\tCity: " + city + ", Country: " + country);
    scanner.close();
  }

  public static void workbook3_1() {
    double change = 3.50;
    double price = 2.50;
    System.out.println("Hi Java, do I have enough change to buy chips?");
    System.out.println("Java: " + (change >= price) + "\n");

    int capacity = 12;
    int people = 15;
    System.out.println("Hi Java, can the elevator support everyone?");
    System.out.println("Java: " + (capacity > people) + "\n");

    String request = "PS5";
    String purchase = "Toy car";
    System.out.println("Hi Java, will my friend be happy?");
    System.out.println("Java: " + (request.equals(purchase)) + "\n");

    int space = 9;
    int guests = 8;
    System.out.println("Hi Java, will all my friends fit at the dinner party?");
    System.out.println("Java: " + (space > guests) + "\n");

    int yourVotes = 24;
    int competitorVotes = 43;
    System.out.println("Hi Java, will I win the election?");
    System.out.println("Java: " + (yourVotes > competitorVotes) + "\n");
  }

  public static void workbook3_2() {
    double wallet = 100.0;
    double toyCar = 5.99;
    double nike = 95.99;

    System.out.println("Can I have this car?");
    if (wallet - toyCar >= 0) {
      System.out.println("Sure!");
      wallet -= toyCar;
    } else {
      System.out.println("Sorry, I only have $" + (wallet) + " left.");
    }

    System.out.println("Can I have these Nike shoes?");
    if (wallet - nike >= 0) {
      System.out.println("Sure!");
      wallet =- nike;
    } else {
      System.out.println("Sorry, I only have $" + (wallet) + " left.");
    }
  }

  public static void workbook3_3() {
    int gryffindor = 400;
    int ravenclaw = 200;

    if (gryffindor - ravenclaw > 299) {
      System.out.println("Gryffindor wins the championship!");
    } else if (gryffindor - ravenclaw >= 0) {
      System.out.println("Gryffindor comes in second place!");
    } else if (gryffindor - ravenclaw < -99) {
      System.out.println("Gryffindor takes third place.");
    } else {
      System.out.println("Gryffindor places last in the quiddich championships. :(");
    }
  }

  public static void workbook3_4() {
    int temp = 25;

    if (temp >= 22) {
      System.out.println("It\'s pretty warm out.");
    } else if (temp > 12) {
      System.out.println("It\'s pretty cold out.");
    } else {
      System.out.println("It\'s freezing. Don\'t go outside.");
    }
  }

  public static void workbook3_5() {
    boolean holiday = false;
    boolean weekend = true;

    if (!holiday && !weekend) {
      System.out.println("Get up for your day job.");
    } else if (holiday) {
      System.out.println("It\'s a holiday! Take a paid day off.");
    } else {
      System.out.println("Enjoy the weekend! :D");
    }
  }

  public static void workbook3_6() {
    String day = "friday";
    String result;

    System.out.println("Hey! Are you free on " + day + "?");
    System.out.println("Let me check...");

    switch (day.toLowerCase()) {
      case "sunday":
        result = "Sorry, can\'t";
        break;
      case "monday":
        result = "I have work that day.";
        break;
      case "tuesday":
        result = "I have a few hours available.";
        break;
      case  "wednesday":
        result = "Sorry, I have to take some online classes.";
        break;
      case "thursday":
        result = "I have work that day.";
        break;
      case "friday":
        result = "Sure, I can hang out that day.";
        break;
      case "saturday":
        result = "Sure, I can hang out that day.";
        break;
      default:
        result = "I think you have a typo in your code.";
    }

    System.out.println(result);
  }

  public static void main(String[] args) {
    // workbook1_1();
    // workbook2_1();
    // workbook2_2();
    // workbook2_3();
    // workbook2_4();
    // workbook2_5();
    // workbook3_1();
    // workbook3_2();
    // workbook3_3();
    // workbook3_4();
    // workbook3_5();
    // workbook3_6();
  }
}