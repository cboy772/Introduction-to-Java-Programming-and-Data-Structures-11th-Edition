import java.util.Scanner;
public class GradesAverage {
   public static void main(String[] args){
      
      //Declare and initialize variables
      double grade = 0.0;//Holds the user inputed grade to be averaged
      double sum = 0.0;//The sum of all the inputed grades
      double avg = 0.0;//The average of all the inputed grades
      Scanner s = new Scanner(System.in);
      int n = 0;//Holds the number grades that have been inputted and fall in the valid range
      
      System.out.println("When you are done entering grades, enter a negative number");

      
      while (grade >= 0.0){
         
         //Prompt user to input a grade between 0.0 and 100.0
         System.out.print("Input a grade between 0.0 and 100.0: ");
         grade = s.nextDouble();
         
         if (grade >= 0.0){
            if (grade <= 100.0){
               sum = sum + grade;
               n = n + 1;
            } else {
               System.out.println("That grade is not between 0.0 and 100");
            }//End of nested if-else statement
         }//End of fist if-else statement
      }//End of while loop
      avg = sum / n;
      System.out.print("The average of the grades is: ");
      System.out.println(avg);
   }//End of main method
}//end of class