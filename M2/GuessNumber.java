import java.util.Scanner;
public class GuessNumber {
   public static void main(String[] args){
      
      //Declare and initialize variables 
      int number = 0;
      int guess = 0;
      Scanner input = new Scanner(System.in);
      
      //Generate a random int between 0 and 100
      number = (int)(Math.random() * 101);
      
      //Get a guess from the user and compare it to number
      guess = -1;
      
      //Test if number is equal to guess
      while (guess != number){
         System.out.println("Enter your guess: ");
         guess = input.nextInt();
            if (number == guess){
               System.out.print("Yes, the number is ");
               System.out.println(number);
            } else {
               if (guess > number){
                  System.out.println("Your number is too high");
               } else {
                  System.out.println("Your guess is too low");
               }//end inner if-else
            }//end outermost if-else
      }//end of while loop
   }//End of main
}//End of class