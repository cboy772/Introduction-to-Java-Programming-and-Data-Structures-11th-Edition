import java.util.Scanner;
public class PoundsToKilograms {
   public static void main(String[] args){
      //Declare and initialize variables
      double pounds = 0.0;
      double kilograms = 0.0;
      Scanner input = new Scanner(System.in);
      
      //Prompt the user to enter a number of pounds to be converted to kilograms
      System.out.println("Enter a number in pounds: ");
      pounds = input.nextDouble();
      kilograms = pounds * 0.454;
      
      //Display the conversion 
      System.out.println(pounds + " pounds is " + kilograms + " kilograms");
   }//End of main method
}//End of class