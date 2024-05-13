import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;
public class CheckOut {
  public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
       List<String> item = new ArrayList<>();
        Date date = new Date();

  System.out.print("Enter customer name: ");
  String name = scanner.nextLine();

  System.out.print("Enter cashier name: ");
  String cashierName = scanner.nextLine();

  String addMore;
  double subtotal = 0;
  double discountRate = 0.1;
  double discountAmount = 0;
  double vatRate = 0.075;
  double vatAmount = 0;

  do {

      System.out.print("What did the user buy?: ");
      String itemName = scanner.nextLine();

      System.out.print("How many pieces?: ");
      double quantity = scanner.nextInt();

      System.out.print("How much per unit?: ");
      double pricePerUnit = scanner.nextDouble();

     double itemTotal = quantity * pricePerUnit;
     subtotal += itemTotal;

      item.add("\t" + "\t" + itemName + "\t" + quantity + "\t" + pricePerUnit + "\t" + quantity * pricePerUnit);

      scanner.nextLine();

      System.out.println("Add more items? (yes/no)");
      addMore = scanner.nextLine();

           } while (addMore.equalsIgnoreCase("yes"));

            discountAmount = subtotal * discountRate;
            vatAmount = subtotal * vatRate;
            double discountedTotal = subtotal - discountAmount;
            double totalWithVAT = discountedTotal + vatAmount;
      
    String semicolon = """
                         SEMICOLON STORES
                         MAIN BRANCH
                         LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                         TEL: 03293828343
                         """;

     System.out.println(semicolon);
     System.out.println("Date: " + date);
     System.out.println("Cashier: " + cashierName);
     System.out.println("Customer Name: " + name);
     System.out.println("=====================================================================");
     System.out.println("\tITEM-NAME\tQUANTITY\tPRICE-PER-UNIT\tTOTAL");
System.out.println("---------------------------------------------------------------------");

        for (String items : item) {
           System.out.println(items);
                }
      System.out.println("----------------------------------------------------------------------");
 System.out.println("\tSubtotal: " + subtotal);
 System.out.println("\tDiscount: " + discountAmount);
 System.out.println("\tVat @7.5: " + vatAmount);

     double billTotal = totalWithVAT;

System.out.println("======================================================================");
System.out.println("\tBill total: " + billTotal);
System.out.println("======================================================================");
System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY "  +  billTotal);
System.out.println("======================================================================");


  System.out.print("How much did the customer give to you?: ");
  double amount = scanner.nextInt();

  double balance = amount - billTotal;

  System.out.println(semicolon);
     System.out.println("Date: " + date);
     System.out.println("Cashier: " + cashierName);
     System.out.println("Customer Name: " + name);
     System.out.println("=====================================================================");
     System.out.println("\tITEM-NAME\tQUANTITY\tPRICE-PER-UNIT\tTOTAL");
System.out.println("---------------------------------------------------------------------");

        for (String items : item) {
           System.out.println(items);
                }
      System.out.println("----------------------------------------------------------------------");
 System.out.println("\tSubtotal: " + subtotal);
 System.out.println("\tDiscount: " + discountAmount);
 System.out.println("\tVat @7.5: " + vatAmount);

System.out.println("======================================================================");
System.out.println("\tBill total: " + billTotal);
System.out.println("\tAmount paid: " + amount);
System.out.println("\tBalance: " + balance);
System.out.println("======================================================================");
System.out.println("\t THANK YOU FOR YOUR PATRONAGE");
System.out.println("======================================================================");

   }

}