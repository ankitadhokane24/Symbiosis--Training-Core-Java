//Calculate average of numbers using Array

import java.util.Scanner;

class averageOfArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int avg=0,sum=0;
		System.out.println("Array size is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("Average of numbers:"+avg);
	}
}