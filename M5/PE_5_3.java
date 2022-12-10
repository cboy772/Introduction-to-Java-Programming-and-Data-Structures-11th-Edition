import java.util.Scanner;
public class PE_5_3 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //Randomly generate 2 single digit numbers
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
      
      System.out.println("What is " + number1 + " + " + number2 + "?");
      int studentAnswer = input.nextInt();
      
      //Check whether student's answer is correct
      System.out.println(number1 + " + " + number2 + " equals " + studentAnswer + 
      " is " + (number1 + number2 == studentAnswer));
   }//End of main method
}//End of class