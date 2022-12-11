//Tests whether an inputted character is a vowel or consonant

import java.util.Scanner; 
public class Excercise_4_13 {
   public static void main(String[] args){
      //Declare and initialize variables
      Scanner input = new Scanner(System.in);
      char ch = 0;
      
      System.out.println("Enter a letter: ");
      String s = input.nextLine();
      ch = s.charAt(0);
      
      
      if (Character.isLetter(ch)) {
         char temp = Character.toLowerCase(ch);
         if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
            System.out.println(ch + " is a vowel");
         else 
            System.out.println(ch + " is a consonant");
             
      } else 
         System.out.println(ch + " is an invalid input");
      
   }//End of main method
}//End of public class