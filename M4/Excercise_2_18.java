import java.util.Scanner;
public class Excercise_2_18 {
   public static void main(String[] args){
      double a = 0;
      double b = 0;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a value for a: ");
      a = input.nextDouble();
      System.out.println("Enter a value for b: ");
      b = input.nextDouble();
      
      System.out.println((int)Math.pow(a, b));

   }//End of main method 
}//End of class