//Voting Eligibility Checker

import java.util.Scanner;

class voting
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=s.nextInt();
		
		if(age<18)
		{
			System.out.println("Candidate is not Eligibile");
		}
		else
		{
			System.out.println("Candidate is  Eligibile");
		}
	}
}