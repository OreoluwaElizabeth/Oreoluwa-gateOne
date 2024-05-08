public class TaskFour {

   public static int[] evenIndex(int[] num) {

   
   for(int counter = 0; counter < num.length; counter++) {
 
   if (counter % 2 == 0) {
   
   num += counter;
    }
  return num;
  }


public static void main(int[] num) {

int[] num = new int {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

System.out.print(Arrays.toString(evenIndex(num)));

}