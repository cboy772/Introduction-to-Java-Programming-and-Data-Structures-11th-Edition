//Find the GCD of two integers

import java.util.Scanner;
public class Excercise_5_14 {
   public static void main(String[] args){
      //Declare and initialize variables
      Scanner input = new Scanner(System.in);
      System.out.println("Enter first positive integer: ");
      int n1 = input.nextInt();
      System.out.println("Enter second positive integer: ");
      int n2 = input.nextInt();
      int gcd = 1;
      
      for (int d = Math.min(n1, n2); d <= n1 && d <= n2; d--){
         if (d > 0) {
            if (n1 % d == 0 && n2 % d == 0)
            gcd = d;
            break;
         }//End if
      }//End for loop
      
      System.out.println("The gcd for " + n1 + " and " + n2 + " is " + gcd);   
      
   }//End of main method
}//End of class