public class Excercise_7_07 {
   public static void main(String[] args){
      //Declare and initialize variables
      int[] count = new int[10];//Hold the number of occurences for each digit between 0 and 9
      
      //Generate 200 random numbers between 0 and 9
      for (int i = 0; i < 200; i++) {
         count[(int)(Math.random() * 10)] ++;
      }//End of for loop
      
      //Find the count of each number in the array and display them
      for(int i = 0; i < count.length; i++){
         System.out.println("The number " + i + " occurs " + count[i] + ((count[i] > 1) ? " times" : " time"));
      }//End of for loop
   }//End of main method
}//end of public class