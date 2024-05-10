import java.util.Scanner;

public class AtmCardValidator {

    public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to ATM card validator!!!");

    System.out.print("Kindly input your card number?: ");
    String cardNumber = scanner.nextLine();

    boolean isValidLength = Stringlength(cardNumber);

    if (isValidLength) {
      System.out.println("Card number is valid.");
     }
    
     else {
      System.out.println("Card number is not valid.");
    }
}

public static boolean Stringlength(String cardNumber) {
  
    int validLength = 16;
    return cardNumber.length() == validLength;

  }



 }


