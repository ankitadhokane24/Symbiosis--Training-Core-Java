//Input month number and print number of days in that month.

import java.util.Scanner;

class monthdays
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Month:");
		int m=s.nextInt();
		
		if(m==1 || m==3 ||m==5 || m==7 || m==8 || m==10 || m==12)
		{
			System.out.println("Number of days in this month:31days");
		}
		else if(m==4 || m==6 || m==9 || m==11)
		{
			System.out.println("Number of days in this month:30days");
		}
		else if(m==2)
		{
			System.out.println("Number of days in this month:27/28days");
		}
		else
		{
			System.out.println("Invalid Month");
		}
	}
}
	
	