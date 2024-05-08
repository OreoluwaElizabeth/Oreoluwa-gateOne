import java.util.Random;
import java.util.Scanner;

public class ArithmeticQuestions {

   public static void main(String [] args) {

   Scanner scanner = new Scanner(System.in);

   System.out.println("Welcome to Arithmetic question");

   System.out.println("You have 10 minutes!! to answer these questions!....GOODLUCK!!!");

   System.out.print("Enter your name: ");
   String name = scanner.nextLine();

   int numberOfQuestions = 10;
   int score = 0;

   for (int counter = 0; counter < numberOfQuestions; counter++) {
        Random rand = new Random();
        int number1 = rand.nextInt(10) + 1;
        int number2 = rand.nextInt(10) + 1;

        int operatorIndex = rand.nextInt(3);
        char operator = '+';
        int result = 0;

            if (operatorIndex == 0) {
                operator = '+';
                result = number1 + number2;
             }
            else if (operatorIndex == 1) {
                 operator = '-';
                 result = number1 - number2;
              }
            else if (operatorIndex == 2) {
                 operator = '*';
                 result = number1 * number2;
              }
            else {
                System.out.print("Invalid");
              } 

        System.out.printf("Question %d: %d %c %d = ?\n", counter + 1, number1, operator, number2);
        int answer = scanner.nextInt();

        if (answer == result) {
           System.out.println("Congratulations, " + name + "! You are correct. :) ");
           score++;
         }
        else {
            System.out.println("You are wrong, " +  name  + " Try again");
          }
        
     }


System.out.println("==============================");
System.out.print("Final score is: " + score); 
  

  }

}