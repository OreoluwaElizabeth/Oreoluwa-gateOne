import java.util.Scanner;

public class TaskEight{

     public static void main(String [] args) {

     Scanner scanner = new Scanner(System.in);

     int sum = 0;
     double average = 0; 
     
     for(int i = 0; i < 10; i++) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number >= 0 && number <= 100) {

        sum += number;
        average = sum / 5;

        }
      else {
        System.out.println("Enter a valid number between 0 and 100");
      }
       
       }
     System.out.println("The sum is " + sum);
     


    }


}