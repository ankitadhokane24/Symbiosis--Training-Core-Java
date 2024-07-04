//Write a Program to Calculate the Gross Salary of an Employee in Java

import java.util.Scanner;

class grosssalary
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter basic salary of employee:");
		double salary=s.nextDouble();

		System.out.println("Enter HRA price:");
		float HRA=s.nextFloat();

		System.out.println("Enter Other Allowance Price:");
		Float other=s.nextFloat();

		double grosssalary=salary+HRA+other;
		System.out.println("Gross Salary:"+grosssalary);
	}
}