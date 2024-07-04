//Fibonacci Series in Java
import java.util.Scanner;

class Fibonacci
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to which is to be found:");
		int n=s.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}