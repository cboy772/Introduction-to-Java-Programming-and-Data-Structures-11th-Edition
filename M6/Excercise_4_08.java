import java.util.Scanner;
public class Excercise_4_08 {
   public static void main(String[] args){
      //Declare and initialize variables
      Scanner input = new Scanner(System.in);
      int code = 0;
      
      System.out.println("Enter an ASCII code between 0 and 127: ");
      code = input.nextInt();
            
      if (code > 0 && code < 127)
         System.out.println("The character for the ASCII code " + code + " is " + (char)code);
      else 
         System.out.println("Not a valid ASCII code between 0 and 127");
      //End of if else
   }//End of main method
}//End of public class