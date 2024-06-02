import java.util.Scanner;

public class Javapedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("******* JAVAPEDIA *******");
    System.out.print("How many entries do you want to make? ");
    int dbLength = scan.nextInt();
    scan.nextLine();

    String[][] database = new String[dbLength][3];

    for (int i = 0; i < database.length; i++) {
      System.out.println("\nFigure " + (i + 1));
      for (int j = 0; j < database[i].length; j++) {
        switch (j) {
          case 0: {
            System.out.print("\tName: ");
            database[i][j] = scan.nextLine();
            break;
          }
          case 1: {
            System.out.print("\tDate of birth (mm/dd/yyyy): ");
            database[i][j] = scan.nextLine();
            break;
          }
          case 2: {
            System.out.print("\tOccupation: ");
            database[i][j] = scan.nextLine();
            break;
          }
          default: break;
        }
      }
    }
    System.out.print("\n");

    for (String[] person : database) {
      System.out.print("ENTRY:");
      for (String field : person) {
        System.out.print("\t" + field);
      }
      System.out.print("\n\n");
    }

    System.out.print("Who do you want information on? ");
    String query = scan.nextLine();
    System.out.println("\nResults of search: " + query);

    for (String[] person : database) {
      if (person[0].toLowerCase().contains(query.toLowerCase())) {
        System.out.println("Information on " + person[0]);
        System.out.println("\tNAME \t\tDATE OF BIRTH \tOCCUPATION");
        for (String field : person) {
          System.out.print("\t" + field);
        }
        System.out.print("\n\n");
      }
    }
  }
}