import java.util.Scanner;
public class Excercise_7_03 {
   public static void main(String[] args){
      //Declare and initialize variables
      Scanner s = new Scanner(System.in);
      int[] numbers = new int[50];
      
      //User inputs any amount of numbers between 1 and 50
      int currentNumber = 0;
      System.out.println("Enter the integers between 1 and 50: ");
      do {
         currentNumber = s.nextInt();
         if (currentNumber != 0)
            numbers[currentNumber-1]++;
      } while (currentNumber != 0);//End of do while loop
      //Counts the occurence of each number
      
      for (int i=0; i < numbers.length; i++){
         if (numbers[i] != 0){
            System.out.println(i+1 + " occurs " + 
            numbers[i] + ((numbers[i]==1) ? " time." : " times."));
         }//End of if statement
      }//End of for loop
      
   }//End of main method
}//End of class