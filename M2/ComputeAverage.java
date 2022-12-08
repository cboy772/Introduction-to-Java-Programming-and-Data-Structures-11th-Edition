import java.util.Scanner;

public class ComputeAverage {
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      double number1 = 0.0;
      double number2 = 0.0;
      double number3 = 0.0;
      double average = 0.0;
      
      System.out.println("Enter three numbers: ");
      number1 = input.nextInt();
      number2 = input.nextInt();
      number3 = input.nextInt();
      average = ((number1 + number2 + number3) / 3);
      System.out.println("The average of these numbers is ");
      System.out.print(average);
      
   }//end main
}//end class