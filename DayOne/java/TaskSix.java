import java.util.Scanner;

public class TaskSix{

     public static void main(String [] args) {

     Scanner scanner = new Scanner(System.in);

     int sum = 0;
     double average = 0; 
     
     for(int i = 0; i < 10; i++) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number % 2 == 0) {

        sum += number;
        average = sum / i;

        }
       
       }
     System.out.println("The average is " + average);


    }


}