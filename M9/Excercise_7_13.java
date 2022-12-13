import java.util.Scanner;
public class Excercise_7_13 {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.print("Enter the list length: ");
      int listLength = s.nextInt();//Hold the length of the list of numbers
      int[] numbers = new int[listLength];
      
      System.out.println("Enter the list of numbers: ");
      for(int i = 0; i < listLength; i++){
         numbers[i] = s.nextInt();
      }//End of for loop
      
      System.out.print(randomInt(numbers) + " ");
   }//End of main method
   
   public static int randomInt(int... numbers){
      int result = numbers[(int)Math.random()*numbers.length];
      
      return result;
      
   }//End of randomInt method
   
}//End of public class