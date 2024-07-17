//Java Program to print the elements of an array

import java.util.Scanner;

class printArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=s.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter Elements of array:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Array Elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}