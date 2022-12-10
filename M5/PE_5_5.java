import java.util.Scanner;
public class PE_5_5 {
   public static void main(String[] args){
      //Generate random lottery number
      int lottery = (int)(Math.random() * 100);
            
      //Prompt user to enter a lottery number
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your lottery pick (2 digits): ");
      int guess = input.nextInt();
      
      //Get digits from lottery
      int lotteryNumber1 = lottery / 10;
      int lotteryNumber2 = lottery % 10;
      
      //Get digits from guess
      int guessNumber1 = guess / 10;
      int guessNumber2 = guess % 10;
      
      if (guess == lottery)
         System.out.println("Exact match: you win $10,000!");
      else if (lotteryNumber1 == guessNumber2 && lotteryNumber2 == guessNumber1)
         System.out.println("Match all digits: you win $3,000!");
      else if (lotteryNumber1 == guessNumber1 || lotteryNumber1 == guessNumber2 
            || lotteryNumber2 == guessNumber1 || lotteryNumber2 == guessNumber2)
         System.out.println("Match one digit: you win $1,000!");
      else
         System.out.println("Sorry no match");
   }//End method
}//End class