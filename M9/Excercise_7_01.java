import java.util.Scanner;
public class Excercise_7_01 {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int students = 0;//Holds the number of students scores
      
      System.out.println("Enter the number of students: ");
      students = s.nextInt();
      int[] scores = new int[students];//An array that contains the scores of each student

      
      //Gather each score
      System.out.println("Enter " + students + " scores: ");
      for (int i = 0; i < scores.length; i++){
         scores[i] = s.nextInt();
      }//End of for loop
      
      
      //Find the best score
      int best = scores[0]; //Hold the value of the best score
      for (int i = 1; i < scores.length; i++){
         if(scores[i] > best) best = scores[i];
      }//End of for loop
      
      //Assigns grades
      for (int i = 0; i < scores.length; i++){
         if (scores[i] >= best - 5)
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
         else if (scores[i] >= best - 10)
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
         else if (scores[i] >= best - 15)
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
         else if (scores[i] >= best - 20)
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
         else 
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
      }//End of for loop
   }//End of main method
}//End of class