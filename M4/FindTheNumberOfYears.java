import java.util.Scanner;
public class FindTheNumberOfYears {
   public static void main(String[] args){
      //Declare and initialize variables 
      int minutes = 0;
      int remainingMinutes = 0;
      int numberOfDays = 0;
      int numberOfYears = 0;
      Scanner s = new Scanner(System.in);
      
      //Prompt the user to enter a number of minutes
      System.out.println("Enter the number of minutes: ");
      minutes = s.nextInt();
      
      //Display the maximum number of years and remaing days for the inputted minutes
      numberOfYears = minutes / 525600;
      remainingMinutes = minutes % 52560;
      numberOfDays = remainingMinutes / 1440;
      
      System.out.println(minutes + " minutes is approximately " + numberOfYears + " years and " + numberOfDays + " days");
      
   }//End of main method
}//End of class