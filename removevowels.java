 //function to check character is vowel or not
import java.util.Scanner;

 class removevowels
{
    
      public static boolean isVowel(char ch)
     {
         	 	switch(ch)
		{
            		case 'A': case 'E': case 'I': case 'O': case 'U':
            		case 'a': case 'e': case 'i': case 'o': case 'u':
                			return true;
            		default:
                			return false;           
          	}
      }
       
      public static void main(String args[])
     {
	Scanner s=new Scanner(System.in);
          System.out.println("Enter String:");
	String text=s.next();
          String text1="";
          char ch;
           
          System.out.println("String before removing vowels: " + text);
           
          for(int i=0; i<text.length(); i++)
	{
              	ch=text.charAt(i);
              	if(!isVowel(ch))
		{
                  		text1+=ch;
              	}
          }           
          System.out.println("String after removing vowels: " + text1);
      }
}