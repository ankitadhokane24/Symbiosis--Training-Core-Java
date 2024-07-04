import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int no=n;
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==no)
		{
			System.out.println("Number is palindrome");	
		}
		else
		{
			System.out.println("Number is not palindrome");	
		}

	}
}