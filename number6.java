//Check whether a number is positive, negative or zero using a switch case.

import java.util.Scanner;

 class number6
{
    	public static void main(String args[])
    	{
        		int n,c;
        		Scanner sc=new Scanner(System.in);
        		System.out.print("Enter a number ");
        		n=sc.nextInt();
        		c=(n>0)?1:(n<0)?2:3;

        		switch(c)
        		{
           		 case 1:
                			System.out.print("Positive Number");
                		break;

            		case 2:
                			System.out.print("Negative Number");
                		break;

            		default:
               			 System.out.print("Zero");
        		}
    	}
}