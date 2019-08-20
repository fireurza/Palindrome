import java.util.*;
public class Palindrome
{
   public static void main(String[] args)
   {
       boolean isPalindrome=true;
       Scanner word = new Scanner(System.in);
       
       System.out.print("Enter a String: ");
       String input = word.nextLine();
       
       word.close();
       
       try {
	       while(true) {
    		   for(int i=0,j=input.length()-1; i<input.length()/2; i++,j--) {
        		   if(input.charAt(i)!=input.charAt(j)) {
        			   System.out.println("The string is NOT a Palindrome");
        			   isPalindrome=false;
        			   System.exit(0);
        		   }
        		   if (isPalindrome==true) {
        			   System.out.println("The string is a Palindrome");
        			   System.exit(0);
        		   }
    		   }
    	   }
       }

       catch(Exception e) {
    	   System.out.println(e.getMessage());
       }
   }
}