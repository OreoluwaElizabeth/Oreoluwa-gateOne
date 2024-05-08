import java.util.Scanner;

public class TaskOne{

     public static void main(String [] args) {

     Scanner scanner = new Scanner(System.in);

     int sum = 0; 
     
     for(int i = 0; i < 10; i++) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        sum += number;
        

     }

     System.out.print("The sum is " + sum);






}





}