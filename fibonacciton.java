//Print Fibonacci series till n

import java.util.Scanner;

class fibonacciton
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number upto which series is to produce:");
		int n=s.nextInt();
		int n1=0,n2=1,n3;
		
		System.out.print(n1+" "+n2);		

		for(int i=0;i<=n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}

