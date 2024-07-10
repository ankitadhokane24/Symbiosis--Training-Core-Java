import java.util.Scanner;
class reversenumber
{
	public static void main(String args[])
	{
		int rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		while(n!=0)
		{
			int rem=n%10;
			 rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse number:"+rev);
	}
}