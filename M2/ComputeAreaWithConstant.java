import java.util.Scanner;

public class ComputeAreaWithConstant {

   public static void main(String[] args){
   
      //Declare and Initialize variables
      final double PI = 3.14159;// a constant variable for pi
      Scanner input = new Scanner(System.in);// holds user input
      double radius = 0.0;// holds inputed radius value
      double area = 0.0;// sum of the equation 2pi*r
      
      //Prompt user to enter radius
      System.out.println("Enter a number for radius: ");
      radius = input.nextDouble();
      
      //Find the area witht the given radius
      area = (radius * radius) * PI;
      
      //Display result
      System.out.println("The area for the circle is " + area);
   
   }//end main method

}//end class