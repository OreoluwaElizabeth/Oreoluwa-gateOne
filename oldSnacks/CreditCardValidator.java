import java.util.Scanner;

public class CreditCardValidator {

   public static String getCardType(String number) {

      if (number.startsWith("4") ) {
         return "Visa";
           }
      else if (number.startsWith("5")) {
          return "MasterCard";
             }
      else if (number.startsWith("37")) {
          return "American Express";
             }
      else if (number.startsWith("6")) {
          return "Discover";
               }
      else {
          return "Invalid Card Type";
               }

              }

    public static boolean isLuhnValid(String number) {
         int sum = 0;
         boolean isEven = false;

         for (int i = number.length() - 1; i >= 0; i--) {
            char digitChar = number.charAt(i);
            if (Character.isDigit(digitChar)) {
              int digit = Character.getNumericValue(digitChar);
              if (isEven) {
                digit *= 2;
               if (digit >= 10) {
                 digit = digit % 10 + digit / 10;
                }
               }
               sum += digit;
               isEven = !isEven;
             }
            }
              
             return sum % 10 == 0;
            }

    public static String validateCard(String number) {
        String cardType = getCardType(number);
        if (cardType.equals("Invalid Card Type")) {
           return "Invalid Card Type: " + number;
           }

        if (isLuhnValid(number)) {
          return cardType + " card - Valid: " + number;
            }
        else {
          return cardType + " card - Invalid: " + number;
            }
          }

    public static void main(String [] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your credit card number: ");
      String cardNumber = scanner.nextLine();

      String validationResult = validateCard(cardNumber);
      System.out.println(validationResult);
       }
     }