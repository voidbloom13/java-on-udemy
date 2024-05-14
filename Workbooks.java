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

  public static void main(String[] args) {
    // workbook1_1();
    // workbook2_1();
    // workbook2_2();
    // workbook2_3();
    // workbook2_4();
    // workbook2_5();
  }
}