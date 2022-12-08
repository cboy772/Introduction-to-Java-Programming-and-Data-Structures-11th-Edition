import java.util.Scanner;
public class GuessNumber {
   public static void main(String[] args){
      //Declare and assign variables
      int secret = 42; //This is the number the user has to guess
      int guess = 0; //User inputted guess
      int done = 0;//Decides if the user actually guessed correctly and won, or gave up and inputed a negative integer
      int n = 0; //How many times the user guessed 
      Scanner s = new Scanner(System.in);
      
         while (done == 0 & n < 10){
            //Prompt user to enter a guess as to what the random number is
            System.out.print("Enter an integer between 0 and 100: ");
            guess = s.nextInt();
            
            //Test to see whether guess in under or over the secret value
            if (guess >= secret){
               if (guess == secret){
                  System.out.println("Right On!!");
                  done = 1;
               } else {
                  System.out.println("Too Big");
               }// end of nested if-else
            } else {
               System.out.println("Too Small");
            }//End of first if-else
            
            if (guess < 0){
               done = -1;
            }//End of second if-else
         
            n = n + 1;
            
         }//End of while loop
         if (n < 10){
            if (done > 0){
               System.out.println("You Won!!");
               if (n == 1){
                  System.out.println("It took you " + n + " guess");
               } else {
                  System.out.println("It took you " + n + " guesses");
               }//End of nested if-else
            } else {
               System.out.println("You didn't even try");
            }//End of if-else
         } else {
            System.out.println("You used all 10 guesses");
         }
         
   }//End of main method
}//End of class