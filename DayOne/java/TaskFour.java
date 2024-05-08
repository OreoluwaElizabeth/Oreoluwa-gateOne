import java.util.Scanner;

public class TaskFour{

     public static void main(String [] args) {

     Scanner scanner = new Scanner(System.in);

     int sum = 0;
     
    for(int i = 10; i < 20; i++) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(i % 2 == 0) {

        sum += number;

        }
       
       }
     System.out.println("The sum is " + sum);


    }


}