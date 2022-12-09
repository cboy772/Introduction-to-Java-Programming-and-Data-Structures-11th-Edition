import java.lang.Math;
import java.util.Scanner;
public class PE_04_3 {
   public static void main(String[] args) {
      //Declare and initialize variables
      int sector = 0; //Number of sectores
      int capacity = 0; //Capacity of each sector (Bytes)
      double capacityInMB = 0;
      double capacityInKB = 0;
      Scanner input = new Scanner(System.in);
      
      //Get user input
      System.out.println("Enter the number of sectors: ");
      sector = input.nextInt();
      System.out.println("Enter the capacity of 1 sector (in Bytes): ");
      capacity = input.nextInt();
      
      //Caculate disk capacity in MB and KB
      capacityInMB = (sector * capacity) / Math.pow(2, 20);
      System.out.println(capacity * sector);
      System.out.println((capacity * sector) / Math.pow(2, 10));
      capacityInKB = Math.floor(((sector * capacity) / Math.pow(2, 10)) * 100) / 100;
      
      System.out.println("Disk Capacity (MB): " + capacityInMB);
      System.out.println("Disk Capacity (KB): " + capacityInKB);
      
       
   }// end main
}// end class