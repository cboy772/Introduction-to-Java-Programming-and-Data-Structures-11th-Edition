//Display ASCII table

public class Excercise_5_15 {
   public static void main(String[] args){
      //Display Table Heading
      /*System.out.println("       ASCII table");
      System.out.print("\t");
      
      for(int i = 0; i <= 9; i++)
         System.out.print("   " + i);
         System.out.println("\n------------------------------------------");
         
      for (int i = 0; i <= 12; i++){
         System.out.print(i + " | ");
         for (int j = 0; j <= 9; j++){
            char ch = (char)((i * 10) + j);
            System.out.printf("%4c", ch);
         }//End of inner for loop
         System.out.println();
      }//End of outer for loop
      
      
      //Display table body
      */
      
      for (byte ascii = 33; ascii < 127; ascii++){
         System.out.print((char)ascii + " ");
         if ((ascii - 32) % 10 == 0)
            System.out.println();
      }
      
   }//End of main method
}//End of class