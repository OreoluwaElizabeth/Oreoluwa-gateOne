import java.util.Scanner;

public class TicTac {

    public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to X and O game!!!");

    System.out.println("Rules -> You are only allowed to write either X or O");

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    for(int counter = 0; counter < 9; counter++) {

      System.out.print("Enter a letter either X or O: ");
      String input = scanner.next();
      char choice = input.charAt(0);
      boolean validInput = choice == 'X' || choice == 'O';

      if (choice != 'X' && choice != 'O') {
          System.out.println("Invalid input. Please enter a letter either X or O.");
        }
      else {
        int column;
        while (true) {
          System.out.print("Which column do you want to place your letter (1-9): ");
          column = scanner.nextInt();

          if (column >= 1 && column <= 9) {
             break;
            }
         else {
           System.out.println("Invalid column. Please enter a number between 1 and 9");
          }
         }
        }


    }

 }

}