//Java Program to print the sum of all the items of the array
import java.util.Scanner;

class sumofelementArray
{
	public static void main(String args[])
	{
		int sum=0;
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
			sum=sum+a[i];
			System.out.print(a[i]+"\t");
		}
		System.out.println("\nSum of all elements of array:"+sum);
	}
}
