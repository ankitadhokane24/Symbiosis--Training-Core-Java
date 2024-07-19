//Java Program to print the largest element in an array

import java.util.Scanner;

class largestelementArray
{
	public static void main(String args[])
	{
		int max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a size of array:");
		int n=s.nextInt();

		int a[]=new int[n];
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		max=a[0];

		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("\nLargest Element of array is:"+max);
	}
}