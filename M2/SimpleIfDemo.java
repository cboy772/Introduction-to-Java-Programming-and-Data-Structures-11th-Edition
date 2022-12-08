import java.util.Scanner;

public class SimpleIfDemo {
   public static void main(String[] args){
   
      //Declare and Initialize variables
      Scanner input = new Scanner(System.in);
      int number = 0;
      
      //Prompt user to enter an int
      System.out.println("Enter an integer: ");
      number = input.nextInt();
      
      //Test if the value of number is a multiple of 5
      if (number % 5 == 0){
         System.out.println("HighFive");
      }//end if statement
      
      if (number % 2 == 0){
         System.out.println("HiEven");
      }//end if statement
      
      
   }// end of main method
   
}//end of class