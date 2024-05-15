import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {

   public static void main(String [] args) {

   Scanner scanner = new Scanner(System.in);

   Scanner input = new Scanner(System.in);

   ArrayList<String>names = new ArrayList<String>();

   ArrayList<String>phoneNumbers = new ArrayList<String>();

   int userChoice;

   do {

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

             7 -> Exit

             """;

      System.out.println(option);

      userChoice = scanner.nextInt();

      switch (userChoice) {

          case 1: 

              System.out.println("Add Contact");

              do {

                System.out.print("Enter first name: ");
                String firstName = input.nextLine();

                System.out.print("Enter last name: ");
                String lastName = input.nextLine();
   
                String fullName = firstName + " " + lastName;
                names.add(fullName);

                System.out.print("Enter phone number: ");
                String phoneNumber = input.nextLine();
                phoneNumbers.add(phoneNumber);

                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>");

                System.out.println("Saved Successfully!!");

                System.out.print("Do you want to save another contact? (yes/no): ");
            } while (input.nextLine().equalsIgnoreCase("yes"));

            System.out.println("Thank you for using phone book");

            System.out.println(names);

            System.out.println(phoneNumbers);

            break;

  

      case 2:

           System.out.println("Remove / Delete Contact");

           System.out.println("Lists of contacts saved");

           for (int counter = 0; counter < names.size(); counter++) {

                System.out.println((counter + 1) + " "  + names.get(counter) + " -> " + phoneNumbers.get(counter));

            }

            System.out.print("Enter the contact name you want to remove / delete: ");
            String removeContact = input.nextLine();

            int index = -1;
            for (int count = 0; count < names.size(); count++) {
               if (names.get(count).equalsIgnoreCase(removeContact)) {
                    index = count;
                    break;
                 }
               }

             if (index != -1) {
               names.remove(removeContact);
               phoneNumbers.remove(removeContact);
               System.out.println("Deleting >>>>>>>>>>>>>>>>>>>>>>>>>");
               System.out.println("Contact Deleted sucessfully!!!");
                }
            else {
                System.out.println("No contact found.");
              }
            break;

       case 3:

            System.out.println("Find Contact By Phone Number");

            System.out.print("Enter the number you are searching for: ");
            String phoneNumber = input.nextLine();
            
            for (int counting = 0; counting < phoneNumbers.size(); counting++) {
                if (phoneNumbers.get(counting).equals(phoneNumber)) {
                   System.out.println((counting + 1) + " "  + names.get(counting) + " -> " + phoneNumbers.get(counting));
                    }
            else {
                 System.out.print("Contact not found");
                     }
                 }
            break;

       case 4:

            System.out.println("Find Contact By First Name");

            System.out.print("Enter the first name you are looking for: ");
            String firstName = input.nextLine();

            for (int counted = 0; counted < names.size(); counted++) {
                 System.out.println("Comparing: " + names.get(counted) + " with " + firstName);
               if (names.get(counted).equals(firstName)) {
                  System.out.println((counted + 1) + " "  + names.get(counted) + " -> " + phoneNumbers.get(counted));
                   }
                }
            break;

      default:
          if (userChoice != 7)
              System.out.println("Invalid choice");
          break;

     }
  } while (userChoice != 7);


   }
}

   

        



 


