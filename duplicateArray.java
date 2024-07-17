//Java Program to print the duplicate elements of an array

import java.util.Scanner;

class duplicateArray
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
		boolean duplicate=false;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j] )
				{
					duplicate=true;
					System.out.println("Duplicate elements in array is:"+a[j]);
				}
			}
		}
		if(!duplicate)
		{
			System.out.println("No duplicate elements found");
		}
	}
}