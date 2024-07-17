//Concatenate two arrays

import java.util.Scanner;

class concateArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of First array:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter size of second array:");
		int m=s.nextInt();
		int b[]=new int[m];
		
		System.out.println("Enter Elements of first array:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}

		System.out.println("Enter Elements of second array:");
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}

		int k=n+m;
		int c[]=new int[k];
		for(int i=0;i<n;i++)
		{
			c[i]=a[i];	
		}
		for(int i=0;i<m;i++)
		{
			c[n+i]=b[i];
		}
		System.out.println("Concatenated Array:");
		for(int i=0;i<k;i++)
		{
			System.out.println(c[i]+"\t");
		}


	}
}