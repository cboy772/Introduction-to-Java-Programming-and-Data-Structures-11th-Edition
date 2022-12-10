import java.util.Scanner;
public class PE_5_2 {
   public static void main(String[] args){
      //Prompt user to enter a year
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a year to check whether it is a leap year: ");
      int year = input.nextInt();
    
      
      //Check if the year is a leap year
      boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);       
      
      System.out.println(year + " is a leap year? " + isLeapYear);
   }//End main method
}//End class