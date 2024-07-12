//Java Program For Calculate Percentage Of 5 Subjects

import java.util.Scanner;

class percentage
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Marks of 5 subject:");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();

		int total=m1+m2+m3+m4+m5;
		double per=(total/500.0)*100;
		System.out.println(per);
	}
}