import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("How many students do you have? ");
    int noOfStudents = scanner.nextInt();

    System.out.println("How many subjects do they offer? ");
    int noOfSubjects = scanner.nextInt();

    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");

    System.out.print("Saved sucessfully");

    System.out.println();

    
    int[][] scores = new int[noOfStudents][noOfSubjects];

    for (int i = 0; i < noOfStudents; i++) {
        double total = 0;

        for (int j = 0; j < noOfSubjects; j++) {

           System.out.println("Entering score for student" + (i + 1) + ":");
           System.out.println("Enter score for subjects" + (j + 1) + ":");

           int score;
           do {
              score = scanner.nextInt();
              if (score < 0 || score > 100 ) {
                  System.out.println("Invalid score");
              } 

          } while (score < 0 || score > 100);

       
         scores[i][j] = score;

         total += score;

         System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");

         System.out.println("Saved sucessfully");

       }

   }

    System.out.print("=============================================================\nSTUDENT\t"); 

    for(int i = 0; i < noOfSubjects; i++) {
         System.out.printf("\tSUB%-4s", (i+1)  + "");

     }
    
   System.out.print("\tTOT\tAVE\tPOS");

   System.out.print("\n=============================================================\n");

   for(int counter = 0; counter < scores.length; counter++) {

      System.out.print("STUDENT" + (counter+1));

     double total = 0;

     double average = 0;

     for(int k = 0; k < noOfSubjects; k++) {

        System.out.print("\t " + scores[counter][k]);

        total += scores[counter][k];

        average = total / noOfSubjects;
    }

    System.out.printf("    %.2f" , total);

    System.out.printf("    %.2f" , average);

    System.out.println();

    int currentPosition = 1;
    for (int k = 0; k < noOfStudents; k++) {
        if (Arrays.stream(scores[k]).sum() > Arrays.stream(scores[counter]).sum()) {
            currentPosition++;
       }
     }
     System.out.print("\t" + currentPosition + "\n");
   }

   

  System.out.print("================================================================");
int[] subjectsPositions = new int[noOfSubjects];
Arrays.fill(subjectsPositions, 1);
 
for (int j = 0; j < noOfSubjects; j++) {
     int passes = 0;
     int fails = 0;
     for (int i = 0; i < noOfStudents; i++) {
         if (scores[i][j] >= 50) {
             passes++;
           }
         else {
             fails++;
           }
       }
       System.out.println("\nSubject " + (j + 1) + " Summary:");
       System.out.println("Number of Passes: " + passes);
       System.out.println("Number of Fails: " + fails);
       System.out.println("Highest Rank: " + subjectsPositions[j]);

     }
  System.out.print("\n================================================================\n");

}


}