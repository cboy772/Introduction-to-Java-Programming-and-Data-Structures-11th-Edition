import java.util.Scanner;
public class TestMyStringLib {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a text string: ");
      String str = s.nextLine();
      
      String[] words = MyStringLib.tokenize(str);//Holds each individual word that make up str
      for (int i = 0; i < words.length; i++)
         System.out.print("[" + words[i] + "]");
      //Display the words that are in it one by one
   }//End of main method
}//End of public class TestMyStringLib