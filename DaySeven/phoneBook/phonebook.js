const prompt = require('prompt-sync')();

const firstNames = [];

const lastNames = [];

const names = [];

const phoneNumbers = [];

let userChoice;

do {

   console.log(`
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

  `);

   userChoice = parseInt(prompt(['choice']).choice);

   switch (userChoice) {

       case 1: 
              console.log("Add Contact");

              do {

                const firstName = prompt("Enter first name: ");
                firstNames.add(firstName);

                const lastName = prompt("Enter last name: ");
                lastNames.add(lastName);

                const fullName = firstName + " " + lastName;
                names.add(fullName);

                const phoneNumber = prompt("Enter phone number: ");
                phoneNumbers.add(phoneNumber);

                console.log("Saving >>>>>>>>>>>>>>>>>>>>>");

                console.log("Saved Successfully!!");

                const = prompt("Do you want to save another contact? (yes/no): ");
            } while (input.nextLine().equalsIgnoreCase("yes"));

            console.log("Thank you for using phone book");

            console.log(names);

            console.log(phoneNumbers);

            break;

  

      case 2:

           console.log("Remove / Delete Contact");

           console.log("Lists of contacts saved");

           for (let counter = 0; counter < names.size(); counter++) {

                console.log((counter + 1) + " "  + names.get(counter) + " -> " + phoneNumbers.get(counter));

            }

            const removeContact = prompt("Enter the contact name you want to remove / delete: ");
            let removeContact = input.nextLine();

            let index = -1;
            for (let count = 0; count < names.size(); count++) {
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
                console.log("No contact found.");
              }
            break;

       case 3:

            console.log("Find Contact By Phone Number");

            const phoneNumber = prompt("Enter the number you are searching for: ");
            
            
            for (let counting = 0; counting < phoneNumbers.size(); counting++) {
                if (phoneNumbers.get(counting).equals(phoneNumber)) {
                   console.log((counting + 1) + " "  + names.get(counting) + " -> " + phoneNumbers.get(counting));
                    }
            else {
                 console.log("Contact not found");
                     }
                 }
            break;

       case 4:

            console.log("Find Contact By First Name");

            const firstName = ("Enter the first name you are looking for: ");
            

            for(let counted = 0; counted < firstNames.size(); counted++) {

               if(firstNames.get(counted).equalsIgnoreCase(firstName)) {
                  console.log((counted + 1) + " "  + names.get(counted) + " -> " + phoneNumbers.get(counted));
                   }
             }
            break;

       case 5:

            console.log("Find Contact By Last Name");

            const lastName = prompt("Enter the last name you are looking for: ");

            for (let countings = 0; countings < lastNames.size(); countings++) {
               if (lastNames.get(countings).equalsIgnoreCase(lastName)) {
                   console.log((countings + 1) + " " + names.get(countings) + " -> " + phoneNumbers.get(countings));
                    }
                 }
            break;

       case 6:

            console.log("Edit Contact");

            const editContact = prompt("Select Contact to edit: ");

            let sentinel = -1;
            for (let counters = 0; counters < names.size(); counters++) {
               if (names.get(counters).equalsIgnoreCase(editContact)) {
                   sentinel = counters;
                   break;
               }
             }

             if (sentinel != -1) {
                 const newFirstName = prompt("Enter the new first name: ");

                 const newLastName = prompt("Enter the new last name: ");

                 let newFullName = newFirstName + " " + newLastName;
                 names.set(sentinel, newFullName);

                 const newPhoneNumber = prompt("Enter the new phone number: ");
                 phoneNumbers.set(sentinel, newPhoneNumber);
                  
                 console.log("Contact edited sucessfully.");
                }

             else {
                 console.log("Contact not found");
                }
              break;
            
      default:
          if (userChoice != 7)
              console.log("Invalid choice");
          break;   

     }
  } while (userChoice != 7);


    }

}