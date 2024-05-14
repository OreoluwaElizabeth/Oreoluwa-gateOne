import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {

   public static void main(String [] args) {

   Scanner scanner = new Scanner(System.in);

   ArrayList<String>names = new ArrayList<String>();

   ArrayList<String>phoneNumbers = new ArrayList<String>();

   String option = """

   Welcome to Phone Book

   Please select an option below

   ==============================

   1 -> Add Contact

   2 -> Remove / Delete Contact

   3 -> Find Contact By Phone Number

   4 -> Find Contact By First Name

   5 -> Find Contact By Last Name

   6 -> Edit Contact

   """;

   System.out.println(option);

   int userChoice = scanner.nextInt();

   switch (userChoice) {

   case 1: 

   System.out.println("Add Contact");

   System.out.print("Enter first name: ");
   String firstName = scanner.nextLine();

   scanner.nextLine();
   
   System.out.print("Enter last name: ");
   String lastName = scanner.nextLine();
   
   String fullName = firstName + " " + lastName;
   names.add(fullName);

   System.out.print("Enter phone number: ");
   String phoneNumber = scanner.nextLine();
   phoneNumbers.add(phoneNumber);

   System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>");

   System.out.println("Saved Successfully!!");

       }


  }


}

   

        



 


