public class MyStringLib {
   
   //Take a tring of text and break it down into an array of strings that each represent an individiual
   // word found in the string of text
   public static String[] tokenize(String str){
     String[] tokens = null;
     String draft = str.trim();
     
      while (true) {
         int index = draft.indexOf(' ');
         if (index == -1)
            if (draft.length() > 0)
               index = draft.length();
            else
               break;
         
         String token = draft.substring(0, index).trim();
         tokens = addToken(tokens, token);
         draft = draft.substring(index).trim();
      }//End while
      
      return tokens;
   }//End of tokenize
   
   public static String[] addToken(String[] tokens, String token){
      int len = (tokens == null)? 0 : tokens.length;
      String[] newTokens = new String[len+1];      
      if (tokens != null)
         System.arraycopy(tokens, 0, newTokens, 0, len);
      newTokens[len] = token;
      
      return newTokens;
      
   }// End of addToken
}//End of MyStringLib class