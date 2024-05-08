import java.util.Scanner;

public class TaskTwo{

     public static void main(String [] args) {

     Scanner scanner = new Scanner(System.in);

     int sum = 0;
     int average = 0; 
     
     for(int i = 0; i < 10; i++) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        sum += number;
        average = sum / 10;
       
       }
     System.out.print("The average is: " + average);

    }


}