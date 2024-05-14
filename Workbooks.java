public class Workbooks {
  public static void workbook1_1() {
    System.out.println("Printing is fun!");
    System.out.println("Java > Python");
    System.out.println("I spilled Java all over my paper.");
    System.out.println("My dog ate my Java.");
  }

  public static void challenge1() {
    System.out.println("DDDD  H   H");
    System.out.println("D   D H   H");
    System.out.println("D   D H   H");
    System.out.println("D   D HHHHH");
    System.out.println("D   D H   H");
    System.out.println("D   D H   H");
    System.out.println("DDDD  H   H");
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

  public static void main(String[] args) {
    // workbook1_1();
    // challenge1();
    // workbook2_1();
    // workbook2_2();
  }
}