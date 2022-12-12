public class Excercise_5_18 {
   public static void main(String[] args){
      int number = 6;
      
      System.out.println("Pattern A: ");
      for (int row = 1; row <= number; row++){
         for (int num = 1; num <= row; num++){
            System.out.print(num + " ");
         }//End of inner for loop
         System.out.println();
      }//End of outer for loop
      
      System.out.println("\nPattern B");
      for (int row = 1; row <= number; row++){
         for (int num = 1; num <= number - row + 1; num++){
            System.out.print(num + " ");
         }//End of inner for loop
         System.out.println();
      }//End of outer for loop
      
      
      System.out.println("\nPattern C");
      for (int row = 1; row <= number; row++){
         for (int whiteSpace = 1; whiteSpace <= number - row; whiteSpace++){
            System.out.print("  ");
         }
         
            for (int num = 1; num <= row; num++){
               System.out.print(num + " ");
            }//End of inner for loop
         System.out.println();
      }//End of outer for loop

      
      System.out.println("\nPattern D");
      for (int row = 1; row <= number; row++){
      
         for(int whiteSpace = 0; whiteSpace < row ; whiteSpace++){
            System.out.print("  ");  
         }//End of whiteSpace for loop
         
         for (int num = 1; num <= number - row + 1; num++){
            System.out.print(num + " ");
         }//End of inner for loop
         System.out.println();
      }//End of outer for loop
      

   }//End of main
}//End of class