//Display prime numbers between 1 and 100 or 1 and n

import java.util.Scanner;

class primeupton
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n upto which prime number is to display:");
		int n=s.nextInt();
		for(int i=2;i<=n;i++)
		{
			boolean isprime=true;
		
			for (int j = 2; j<=Math.sqrt(i); j++)
			{
                			if (i % j == 0) 
				{
                    			isprime = false; 
                    			break;
               			}
           		 }
			
			if (isprime) 
			{
                			System.out.print(i + " ");
            		}
        		}
	}	
}