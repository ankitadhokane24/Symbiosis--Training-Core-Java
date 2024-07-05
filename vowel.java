//Character Is Vowel or Consonant

import java.util.Scanner;

class vowel
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=s.next().charAt(0);
	
		if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u')
		{
			System.out.println("Character is vowel");
		}
		else
		{
			System.out.println("Character is constonants");
		}
	}
}