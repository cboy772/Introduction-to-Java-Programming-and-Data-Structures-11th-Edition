import java.util.Scanner;
public class PE_5_1 {
   public static void main(String[] args){
      //Declare and initialize variables
      Scanner s = new Scanner(System.in);
      System.out.println("Enter an int");
      int number = s.nextInt();
      
      //Displays whether a number is divisible by 2 and 3 
      if (number % 2 == 0 && number % 3 == 0)
         System.out.println(number + " is divisible by 2 and 3"); 
      
      //Displays whether a number is divisible by 2 or 3
      if (number % 2 == 0 || number % 3 == 0)
         System.out.println(number + " is divisible by 2 or 3");
         
      //Displays whether the number is divisible by 2 or 3 but not both
      if (number % 2 == 0 ^ number % 3 == 0)
         System.out.println(number + " is divisible by 2 or 3, but not both");
   }//End main method
}//End class