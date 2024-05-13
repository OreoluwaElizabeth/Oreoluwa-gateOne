import java.util.Scanner;
import java.time.LocalDate;
public class DateOfBirth {

   public static void main(String [] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.println("Welcome to your age reveal");

   System.out.println("Kindly enter your date of birth in this format.....D/M/Y");

   System.out.print("Enter your name: ");
   String name = scanner.nextLine();

   System.out.print("Enter your date of birth: ");
   String dateOfBirth = scanner.nextLine();

   int age = calculateAge(dateOfBirth);

   System.out.println(name + " you are " + age +  " years old");

    }

   public static int calculateAge(String dateOfBirth) {
   String [] parts = dateOfBirth.split("/");
   int birthYear = Integer.parseInt(parts[2]);
   int currentYear = 2024;
   return currentYear - birthYear;
     }

 }