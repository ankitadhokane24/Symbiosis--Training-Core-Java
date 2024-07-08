//Check whether the triangle is an equilateral, isosceles or scalene triangle

import java.util.Scanner;

class triangle2
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Three Sides of Triangle :");
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		int s3 = s.nextInt();

		if(s1 == s2 && s2 == s3)
		{
			System.out.println("Equilateral Triangle.");
		}
		else if(s1 == s2 || s1 == s3 || s2 == s3)
		{
			System.out.println("Isosceles Triangle.");
		}
		else 
		{
			System.out.println("Scalene Triangle.");
		}
	}
}