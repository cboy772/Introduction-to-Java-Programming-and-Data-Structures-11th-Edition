import java.util.Scanner;
public class PhysicsAcceleration {
   public static void main(String[] args){
      
      // Declare and initialize variables
      double v0 = 0.0;
      double v1 = 0.0;
      double t = 0.0;
      double acceleration = 0.0;
      Scanner input = new Scanner(System.in);
      
      // Prompt the user to enter values for starting velocity (in m/s),  , along with the time span
      // ending velocity (in m/s), 
      // along with the time span (in seconds)
      System.out.println("Enter v0, v1, and t: ");
      v0 = input.nextDouble();
      v1 = input.nextDouble();
      t = input.nextDouble();
      
      //Calculate acceleration with the given velocity and time values
      acceleration = ((v1 - v0) / t);
      System.out.println("The average acceleration  is " + acceleration);
      
      
   }//End of main method
}//End of public class5