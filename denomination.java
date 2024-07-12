//Denomination of an Amount

import java.util.Scanner;

class denomination
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Amount:");
		int a=s.nextInt();

		int[] demo={100,50,20,10,5,2,1};
		int[] counts=new int[demo.length];

		for(int i=0;i<demo.length;i++)
		{
			if(a>=demo[i])
			{
				counts[i]=a/demo[i];
				a=a%demo[i];
			}
		}
		System.out.println("Denomination of the given amount");
		for(int i=0;i<demo.length;i++)
		{
			if(counts[i]!=0)
			{
				System.out.println(demo[i]+"  : "+counts[i]);
			}
		}
	}
}