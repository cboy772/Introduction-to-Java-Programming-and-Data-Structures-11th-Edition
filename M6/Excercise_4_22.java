//Check substring

import java.util.Scanner;
public class Excercise_4_22 {
   public static void main(String[] args){
      //Declare and initialize variables
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a string s1: ");
      String s1 = input.nextLine();
      System.out.println("Enter a string s2: ");
      String s2 = input.nextLine();
      
      
      if (s1.indexOf(s2) != -1)
         System.out.print(s2 + " is a substring of " + s1);
      else
         System.out.print(s2 + " is not a substring of " + s1);
         
   }//End main method
}//End of class