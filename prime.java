//prime number
import java.util.Scanner;

class prime
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to which is to be found:");
		int n=s.nextInt();
		if(n==0 ||n==1)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			for(int i=2;i<=n;i++)
			{
				if(n%i!=0)
				{
					System.out.println("Number is prime");
					break;
				}
				else
				{
					System.out.println("Number is not  prime");
				}
			}
		}
	}
}