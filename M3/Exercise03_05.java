import java.util.Scanner;
public class Exercise03_05 {
   public static void main(String[] args) {
   
      // Variables Declarations & Initializations
      Scanner input = new Scanner(System.in);
      int today = 0;
      int futureDay = 0;
      int dayToDisplay = 0;
      int elapsedDays = 0;
      
      // Prompt the user to enter an integer for today
      System.out.print("Enter today's day: ");
      today = input.nextInt();
      
      System.out.print("Today is ");
      dayToDisplay = today;
      
      if(dayToDisplay == 0){
         System.out.println("Sunday");
      }else{ 
         if(dayToDisplay == 1){
            System.out.println("Monday");
         }else{ 
            if(dayToDisplay == 2){
               System.out.println("Tuesday");
            }else{ 
               if(dayToDisplay == 3){
                  System.out.println("Wednesday");
               }else{ 
                  if(dayToDisplay == 4){
                     System.out.println("Thursday");
                  }else{ 
                     if(dayToDisplay == 5){
                        System.out.println("Friday");
                     }else{ //if (dayToDisplay == 6)
                        System.out.println("Saturday");
                     }
                  }
               }
            }
         }
      }
      
      System.out.print("Enter the number of days elapsed since today: ");
      elapsedDays = input.nextInt();
   
      System.out.print(" and the future day is ");
   
      futureDay = (today + elapsedDays) % 7;
      dayToDisplay = futureDay;
      
      if(dayToDisplay == 0){
         System.out.println("Sunday");
      }else{ 
         if(dayToDisplay == 1){
            System.out.println("Monday");
         }else{ 
            if(dayToDisplay == 2){
               System.out.println("Tuesday");
            }else{ 
               if(dayToDisplay == 3){
                  System.out.println("Wednesday");
               }else{ 
                  if(dayToDisplay == 4){
                     System.out.println("Thursday");
                  }else{ 
                     if(dayToDisplay == 5){
                        System.out.println("Friday");
                     }else{ // if (dayToDisplay == 6)
                        System.out.println("Saturday");
                     }
                  }  
               }
            }
         }
      }
   }//End of main method
}//End of class