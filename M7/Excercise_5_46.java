import java.util.Scanner;

public class Excercise_5_46 {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a string");
      String input = s.nextLine();      // Get input from a user

      
      //Reverses the string 
      String reverse = "";
      for (int i = input.length() - 1; i >= 0; i--){
         reverse += input.substring(i, i + 1);
      }//End of for loop
      
      //Displays the reversed string
      System.out.println("The string " + input + " reversed is " + reverse);
   }//End of main method
} //end of public class