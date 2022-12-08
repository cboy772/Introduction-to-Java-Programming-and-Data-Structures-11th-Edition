import java.util.Scanner;
public class SentinelValue {
   public static void main(String[] args){
      
      //Declare and initialize variables 
      Scanner input = new Scanner(System.in);
      int data = 0;
      int sum = 0;
      
      //Prompt user to input an int
      System.out.println("Enter an int value (the program exits if the input is 0): ");
      data = input.nextInt();
      
      while (data != 0){
         sum = sum + data;
         System.out.println("Enter an int value (the program exits if the input is 0): ");
         data = input.nextInt();
      }//End of while loop
      System.out.print("The sum is ");
      System.out.println(sum);
      
   }//End of main
}//End of class