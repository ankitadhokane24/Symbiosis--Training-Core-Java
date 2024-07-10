//Java Program to Find square root of a Number without sqrt

import java.util.Scanner;

class squareroot
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to find squareroot:");
		double n=s.nextDouble();
		double temp=0;
		double sqrt=n/2;

		do
		{
			temp=sqrt;
			sqrt=(temp+(n/temp))/2;
		}
		while((temp-sqrt)!=0);
		System.out.println("Square root of number:"+sqrt);
	}
}