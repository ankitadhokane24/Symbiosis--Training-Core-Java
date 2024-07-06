//A Character Is an Alphabet or Not
import java.util.Scanner;
class character
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=s.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("Character is alphabet");
		}
		else
		{
			System.out.println("Character is not alphabet");
		}
	}
}