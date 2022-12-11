//Finds the area of a pentagon

import java.util.Scanner;
public class Excercise_4_01 {
   public static void main(String[] args){
      //Declare and initialize variables
      Scanner input = new Scanner(System.in);
      double r = 0; //Length of the center of a pentagon to the vertex
      double s = 0; //Length of the side
      double area = 0;
      
      System.out.println("Enter length from the center of the pentagon to the vertex: ");
      r = input.nextDouble();
      
      //Compute side length and area
      s = (2 * r) * Math.sin(Math.PI / 5); 
      area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
      
      //Round area to two digits
      area = (double)Math.round(area * 100) / 100;
      
      System.out.println("The area of the pentagon is: " + area);
      
   }//End of main method
}//End of public class