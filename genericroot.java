//find the generic root of number
//Generic number is sum of digit until we get single digit number  i.e 1236=1+2+3+6=12=1+2=3

import java.util.Scanner;

class genericroot
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int rem,sum=0;

		while (n >= 10) 
		{
            		sum = 0; 
            		while (n > 0)
			{
               			rem = n % 10;
                			sum = sum + rem;
                			n = n / 10;
           		}
            		n = sum; 
        		}
        		System.out.println("Generic root of number: " + n);
    	}
}