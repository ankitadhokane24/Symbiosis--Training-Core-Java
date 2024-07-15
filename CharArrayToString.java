import java.util.Scanner;
class CharArrayToString 
{
    	public static void main(String[] args) 
	{
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter the number of characters:");
        	int n = s.nextInt();
       		s.nextLine(); 
		
		char[] charArray = new char[n];
        
        	System.out.println("Enter the characters one by one:");
        	for (int i = 0; i < n; i++) 
		{
            		charArray[i] = s.nextLine().charAt(0);
        	}
        
                	String str1 = new String(charArray);
        		String str2 = String.valueOf(charArray);
        
             	  System.out.println("Converted String using String constructor: " + str1);
       		 System.out.println("Converted String using String.valueOf() method: " + str2);
    	}
}
