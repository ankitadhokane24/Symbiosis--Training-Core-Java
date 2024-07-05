//Armstrong Number
import java.util.Scanner;

class Armstrong
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		int no=n;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==no)
		{
			System.out.println("Number is Armstrong ");
		}
		else
		{
			System.out.println("Number is not  Armstrong ");
		}
	}
}