import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MenstrualApp {

     public static void main(String [] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Welcome to Menstrual App");

     System.out.print("Kindly enter your average cycle length: ");
     int length = scanner.nextInt();

     scanner.nextLine();

     System.out.print("Kindly enter the start date of your last period in this format (MM/dd/yyyy): ");
     String lastPeriodDate = scanner.nextLine();

     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

     LocalDate lastPeriodDates = LocalDate.parse(lastPeriodDate, formatter);

     LocalDate presentDate = LocalDate.now();

     int averageCycleLength = length;

     long days = ChronoUnit.DAYS.between(lastPeriodDates, presentDate);

     LocalDate nextPeriodDate = lastPeriodDates.plusDays(averageCycleLength);

     System.out.println("The days in between is: " + days);

     System.out.println("Your next period date is: " + nextPeriodDate);


    }


}