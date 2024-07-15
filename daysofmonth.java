//Print total number of days in a month using switch case.

import java.util.Scanner;

public class daysofmonth
{
  	public static void main(String[] args) 
	{
    		Scanner s = new Scanner(System.in);
		int month = 0;
   		int days;
		System.out.printf("Enter month number: ");
    		month = s.nextInt();

    		switch (month) 
		{
    			case 4:
    			case 6:
    			case 9:
   			case 11:
      			days = 30;
			System.out.printf("Number of days in %d month is: %d\n", month, days);
      			break;

    			case 1:
    			case 3:
    			case 5:
    			case 7:
    			case 8:
    			case 10:
    			case 12:
      			days = 31;
			System.out.printf("Number of days in %d month is: %d\n", month, days);
      			break;

    			case 2:
      			days = 28;
			System.out.printf("Number of days in %d month is: %d\n", month, days);
      			break;

    			default:
      			days = 0;
			System.out.printf("You have entered an invalid month!!!\n");
      			break;
    		}
      
  	}
}