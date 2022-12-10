import java.util.Scanner; 
public class PE_5_4 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Generate 2 random single digit numbers
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
      
      if (number1 < number2){
         int temp = number1;
         number1 = number2;
         number2 = temp;
      }//End if statement 
      
      //Display subtraction question
      System.out.println("What is " + number1 + " - " + number2 + "?");
      int answer = input.nextInt();
      
      //Test to see if the answer is correct
      System.out.print(number1 + " - " + number2 + " equals " + answer + " is " + 
      (number1 - number2 == answer));
   }//End main method
}//End class