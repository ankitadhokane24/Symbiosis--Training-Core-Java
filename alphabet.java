//Check whether an alphabet is a vowel or consonant using a switch case.

import java.util.Scanner;

class alphabet
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=s.next().charAt(0);
		
		switch(ch)
		{
			case 'a' :
			 case 'A':
			case 'e' :
			case 'E':
			case 'i' :
			case 'I':
			case 'o' :
			 case 'O':
			case 'u' :
			case 'U':
				System.out.println("Character is Vowel");
			break;

			default:
				System.out.println("Character is consonant");
			break;

		}
	}
}