//Java Program to print the elements of an array present on odd position

import java.util.Scanner;

class oddpositionArray
{
	public static void main(String args[])
	{
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
		System.out.println("");
		System.out.println("\n Odd position elements");
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(a[i]+"\t");
			}
		}
	}
}