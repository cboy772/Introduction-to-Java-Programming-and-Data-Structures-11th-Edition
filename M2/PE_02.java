import java.util.Scanner;

public class PE_02 {
      
   public static void main(String[] args){
      int n = 10;
      int value = 0;

      while(n > 0) {
         value = value + n;
         n = n - 1;
      }//end while
      
      System.out.println(value);
      
   }//end main
  
}//end class