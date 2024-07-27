//Check String Is Palindrome Or Not Using For Loop
import java.util.Scanner;

class PalindromeString
{
 	public static void main(String[] args) 
	{
        		Scanner s = new Scanner(System.in);  
        		System.out.print("Enter a string to check if it is a palindrome: ");
        		String str = s.nextLine();  
		
		boolean isPalindrome = true;
		int length = str.length();
        		for (int i = 0; i < length / 2; i++) 
		{
            		if (str.charAt(i) != str.charAt(length - 1 - i)) 
			{
                			isPalindrome = false;
                			break;
            		}
        		}

        		if (isPalindrome) 
		{
            		System.out.println("String is Palindrome");
       		} 
		else 
		{
            		System.out.println( "String is not palindrome.");
        		}
    	}
}
