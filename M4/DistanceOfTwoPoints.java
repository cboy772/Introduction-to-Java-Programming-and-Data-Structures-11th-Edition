import java.util.Scanner; 
public class DistanceOfTwoPoints {
   public static void main(String[] args){
      //Declare and initialize variables
      double x1 = 0.0;
      double y1 = 0.0;
      double x2 = 0.0;
      double y2 = 0.0;
      double distance = 0.0;
      Scanner input = new Scanner(System.in);
      
      //Prompt the user to enter to point (x1, y1) and (x2, y2)
      System.out.println("Enter x1 and y1: ");
      x1 = input.nextDouble();
      y1 = input.nextDouble();
      System.out.println("Enter x2 and y2: ");
      x2 = input.nextDouble();
      y2 = input.nextDouble();
      
      //Calculate and display the distance between the two points
      distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
      System.out.println("The distance between the two points is " + distance);
   
   }//End of main method
}//End of class