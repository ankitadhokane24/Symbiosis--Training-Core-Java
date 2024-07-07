//Input angles of a triangle and check whether the triangle is valid or not.

import java.util.Scanner;

class triangle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three angle of triangle:");
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();
		int sum=a1+a2+a3;

		if(sum==180 && a1>0  && a2>0 && a3>0)
		{
			System.out.println("Triangle is Valid");
		}
		else
		{
			System.out.println("Triangle is not Valid");
		}
	}
}