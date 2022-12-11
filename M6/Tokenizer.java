import java.util.Scanner;
public class Tokenizer {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      String str = "", word = "";
      System.out.println("Type something: ");
      str = s.nextLine();
      int end = 0;
      
      str = str.trim();
      while(true){
         str = str.trim();
         end = str.indexOf(" ");
         if (end == -1){
            word = str;
            str = "";
         } else {
            word = str.substring(0, end);
            str = str.substring(end);
         }
         System.out.println("Word: \t" + word);
         if (str.length() == 0) break;
      }//End while
   }//End main method
}//End class