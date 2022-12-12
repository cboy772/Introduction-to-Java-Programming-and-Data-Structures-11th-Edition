import java.util.Scanner;
public class Excercise_5_49 { 
   public static void main(String[] args){
      String str = "";
      System.out.println("Enter a string: ");
      str = new Scanner(System.in).nextLine();
      str = str.toLowerCase();
      
      int vowels = 0;
      int consonants = 0;
      //Check which letters are vowels or consonants
      for (int i = 0; i < str.length(); i++){
         if (str.charAt(i) == 32) continue;
         else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
               str.charAt(i) == 'o' || str.charAt(i) == 'u')
            vowels += 1;
         else
            consonants += 1; 
      }//End of for loop      
      
      System.out.println("The number of vowels is " + vowels + "\nThe number of consonants is " + consonants);
      
   }//End of public class
}//End of class