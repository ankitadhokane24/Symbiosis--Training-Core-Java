//Calculate Sum of Natural Numbers

import java.util.Scanner;

class naturalnumbers
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number upto to which sum is to find: ");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Natural: "+sum);	
	}
}