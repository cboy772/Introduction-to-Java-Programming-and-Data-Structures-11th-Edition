import java.util.Scanner;
public class TheFinalCountdown {
   public static void main(String[] args){
      //Declare and initialize variables 
      int countdownFrom = 0;
      Scanner s = new Scanner(System.in);
      
      //Prompt user to input an int value to be stored in countdownFrom
      System.out.println("Enter a positive integer to be counted down from: ");
      countdownFrom = s.nextInt();
      
      while (countdownFrom > 0) { 
         int n = 0;
         n = countdownFrom;
         while (n > 0){
            if (n % 2 == 0){
               n -= 1;
               System.out.print(n);
               System.out.print("...");
            } else {
               System.out.print(n);
               System.out.print("...");
            }//end inner if-else
            n -= 1;
         }//End of while loop
         System.out.println();
         
      //Prompt user to input an int value to be stored in countdownFrom
      System.out.println("Enter a positive integer to be counted down from: ");
      countdownFrom = s.nextInt();
      }//End of outer while loop
   }//End of main method
}//end of class