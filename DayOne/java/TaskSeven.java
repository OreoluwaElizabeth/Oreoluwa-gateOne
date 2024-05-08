import java.util.Scanner;

public class TaskSeven{

     public static void main(String [] args) {

     Scanner scanner = new Scanner(System.in);

     int sum = 0;
     double average = 0; 
     
     for(int i = 0; i < 10; i++) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0) {

        sum += number;
        average = sum / 5;

        }
       
       }
     System.out.println("The sum is " + sum);
     System.out.println("The average is " + average);


    }


}