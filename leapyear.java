//Leap Year
import java.util.Scanner;

class leapyear
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year:");
		int y=s.nextInt();
		if (((y% 4 == 0) && (y% 100!= 0)) || (y%400 == 0))
		{
        			 System.out.println("Specified year is a leap year");
		}
     		else
		{
         			System.out.println("Specified year is not a leap year");
		}
   	}
}
		
 