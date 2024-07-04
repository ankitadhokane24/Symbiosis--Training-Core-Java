import java.util.Scanner;
class factnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		int fact=1;
		while(n!=0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial of number:"+fact);
	}
}