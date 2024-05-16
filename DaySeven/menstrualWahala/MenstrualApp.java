import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

     LocalDate nextPeriodDate = lastPeriodDates.plusDays(averageCycleLength);

     LocalDate ovulationDate = lastPeriodDates.plusDays(14);

     LocalDate safePeriodStart = ovulationDate.plusDays(1);

     LocalDate safePeriodEnd = nextPeriodDate.minusDays(1);

     LocalDate fertileWindowStart = lastPeriodDates.plusDays(10);

     LocalDate fertileWindowEnd = ovulationDate;

     System.out.println("Your next period date is: " + nextPeriodDate);

     System.out.println("Your ovulation date is: " + ovulationDate);

     System.out.println("Your safe period is from: " + safePeriodStart + " to " + safePeriodEnd);

     System.out.println("You are most likely to get pregnant within this duration: " + fertileWindowStart + " to " + fertileWindowEnd);


    }


}