import java.util.Scanner;
class character1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=s.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("Character is in Lowercase");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("Character is in Uppercase");	
		}
		else if((ch>='0')  &&  (ch<='9'))
		{
			System.out.println("Character is digit");
		}
		else if((ch=='!') || (ch=='@')|| (ch=='#') || (ch=='$') || (ch=='%') || (ch=='&') || (ch=='*') || (ch=='(') || (ch==')') )
		{
			System.out.println("Character is Special Symbol");
		}
		else
		{
			System.out.println("Invalid character");
		}
	}
}