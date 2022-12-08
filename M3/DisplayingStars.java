/*
   Program Name: DisplayStars
*/

import java.util.Scanner;
public class DisplayingStars {
   public static void main(String[] args){
      //Declare and ititialze variables
      int numberOfStars = 0;//Stores the number of stars the user inputs
      int numberOfLines = 0;//Stores the selected number of lines a user inputs
      int n = 0;
      Scanner s = new Scanner(System.in);
      
      //Prompt user to enter number of stars and store their input
      System.out.println("Enter a # of stars: ");
      numberOfStars = s.nextInt();
      
      //Prompt users to enter the number of lines and store their input
      System.out.println("Enter a # of lines: ");
      numberOfLines = s.nextInt();
      
      while (numberOfLines > numberOfStars){
         System.out.println("Error, number of lines is greater than number of stars.");
         System.out.println("Enter a different of lines to display: ");
         numberOfLines = s.nextInt();
      }//end of if statement
      
      while (numberOfLines > 0){
         while (n < numberOfStars){
            System.out.print("*");  
            n += 1;
         }//End of nested while loop
      
      n = 0;
      
      System.out.println();
      numberOfStars -= 1;
      numberOfLines -= 1;
      
      }//End of parent while loop
   }//End of main method
}//End class