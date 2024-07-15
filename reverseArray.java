//Reverse an array
import java.util.Scanner;

class reverseArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=a[n-1-i];
		}
		System.out.println("Reverse Array");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+"\t");
		}
	}
}