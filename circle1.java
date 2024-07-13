//Find Radius, Circumference and Volume of Cylinder

import java.util.Scanner;

class circle1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Radius:");
		float r=s.nextFloat();
		double pi=3.142;
		System.out.println("Enter your choice:");
		int ch=s.nextInt();

		switch(ch)
		{
			case 1:
				double Area=pi*(r*r);
				System.out.println("Area of circle:"+Area);
			break;

			case 2:
				double C=2*pi*(r*r);
				System.out.println("Circumferenece of circle:"+C);
			break;
		}
	}
}