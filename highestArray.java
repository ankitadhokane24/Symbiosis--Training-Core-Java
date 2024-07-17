//Find out the highest and second highest numbers in an array

import java.util.Scanner;

class highestArray
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
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("\nHighest Element is array is:"+a[n-1]);
		System.out.println("Second Highest Element is array is:"+a[n-2]);
	}
}