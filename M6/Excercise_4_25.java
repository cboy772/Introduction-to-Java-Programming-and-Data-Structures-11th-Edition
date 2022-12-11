//Generate vehicle plate numbers

import java.util.Scanner;
public class Excercise_4_25 { 
   public static void main(String[] args){
      //Declare and initialize variables
      int letter1 = (int)(Math.random() * 26 + 65);
      int letter2 = (int)(Math.random() * 26 + 65);
      int letter3 = (int)(Math.random() * 26 + 65);
      int lastFourNumbers = (int)(Math.random() * 10000);
      
      System.out.println("Your randomly generated plate number is " + (char)letter1 + (char) letter2 +
                           (char)letter3 + lastFourNumbers);

      
      
   }//End of main method
}// End of class