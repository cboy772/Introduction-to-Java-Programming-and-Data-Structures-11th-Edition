import java.util.Scanner;
public class Excercise_3_1 {
   public static void main(String[] ags){
      //Declare and initialize variables
      double a = 0;
      double b = 0;
      double c = 0;
      Scanner input = new Scanner(System.in);
      double discriminant = (Math.pow(b, 2)) - (4 * (a * c));
      
      //Get user input for a, b, and c
      System.out.println("Enter a, b, c: ");
      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();
   }//End main method
}//End class