//Area and Circumference of a Circle

import java.util.Scanner;
class circle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radius:");
		float r=s.nextFloat();
	
		double a=3.14*r*r;
		System.out.println("Area of Circle:"+a);

		double c=2*3.14*r;
		System.out.println("Circumference of Circle:"+c);

	}
}