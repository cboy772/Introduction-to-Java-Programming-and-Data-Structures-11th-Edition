import java.util.Scanner;
public class Exercise03_08 {
   public static void main(String[] args) {
   
      // Variables Declarations & Initialization
      int number1 = 0; // 1st number provided by user
      int number2 = 0; // 2nd number provided by user
      int number3 = 0; // 3rd number provided by user
      int temp = 0; // just to hold temporarily the values when swapping them
      Scanner input = new java.util.Scanner(System.in);

      // getting values from the user
      System.out.print("Enter three integers: ");
      number1 = input.nextInt();
      number2 = input.nextInt();
      number3 = input.nextInt();
   
      // put 1st and 2nd numbers in order
      if(number1 > number2) {
         temp = number1;
         number1 = number2;
         number2 = temp;
      } // end IF
   
      // put 2nd and 3rd numbers in order
      if(number2 > number3) {
         temp = number2;
         number2 = number3;
         number3 = temp;
      } // end IF
   
      // put 1st and 2nd number in order 
      // in case number2 was swapped previously
      if(number1 > number2) {
         temp = number1;
         number1 = number2;
         number2 = temp;
      } // end IF
      
      System.out.print("The sorted numbers are ");
      System.out.print(number1);
      System.out.print(" ");
      System.out.print(number2);
      System.out.print(" ");
      System.out.println(number3);
   
   } // end main method
} // end class