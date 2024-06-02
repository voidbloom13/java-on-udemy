public class Blackjack {
  public static int drawRandomCard() {
    int randomCard = (int) (Math.random() * 13) + 1;
    return randomCard;
  }

  public static String returnCard(int cardNumber) {
    String card = "";

    switch (cardNumber) {
      case 1 -> card = """
                  _____
                 |A _  |
                 | ( ) |
                 |(_'_)|
                 |  |  |
                 |____V|
               """;
      case 2 -> card = """
                  _____
                 |2    |
                 |  o  |
                 |     |
                 |  o  |
                 |____Z|
               """;
      case 3 -> card = """
                  _____
                 |3    |
                 | o o |
                 |     |
                 |  o  |
                 |____E|
               """;
      case 4 -> card = """
                  _____
                 |4    |
                 | o o |
                 |     |
                 | o o |
                 |____h|
               """;
      case 5 -> card = """
                  _____ 
                 |5    |
                 | o o |
                 |  o  |
                 | o o |
                 |____S|
               """;
      case 6 -> card = """
                  _____ 
                 |6    |
                 | o o |
                 | o o |
                 | o o |
                 |____6|
               """;
      case 7 -> card = """
                  _____ 
                 |7    |
                 | o o |
                 |o o o|
                 | o o |
                 |____7|
               """;
      case 8 -> card =  """
                   _____ 
                  |8    |
                  |o o o|
                  | o o |
                  |o o o|
                  |____8|
                """;
      case 9 -> card = """
                  _____ 
                 |9    |
                 |o o o|
                 |o o o|
                 |o o o|
                 |____9|
               """;
      case 10 -> card = """
                  _____ 
                 |10  o|
                 |o o o|
                 |o o o|
                 |o o o|
                 |___10|
               """;
      case 11 -> card = """
                  _____
                 |J  ww|
                 | o {)|
                 |o o% |
                 | | % |
                 |__%%[|
               """;
      case 12 -> card = """
                  _____
                 |Q  ww|
                 | o {(|
                 |o o%%|
                 | |%%%|
                 |_%%%O|
               """;
      case 13 -> card = """
                  _____
                 |K  WW|
                 | o {)|
                 |o o%%|
                 | |%%%|
                 |_%%%>|
               """;
      default -> {
          }
    }
    return card;
  }

  public static void main(String[] args) {
    int myCards;
    int dealerCards;

    
  }
}