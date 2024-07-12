//Number Is Divisible By 11 Using (VEDIC MATH)

import java.util.Scanner;

class divisblebyvedic
{
	public  static void main(String args[])
	{
		int a[]=new int[4];
		int b[]=new int[4];
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number:");
		for(int i=0;i<4;i++)
		{
			a[i]=s.nextInt();
		}

		int sume=0,sumo=0;
		System.out.println("Number is:");
		for(int i=0;i<4;i++)
		{
			System.out.print(a[i]+"\n");
			if(a[i]%2==0)
			{
				sume=sume+a[i];
			}
			else
			{
				sumo=sumo+a[i];
			}
		}
		System.out.println(sume);
		System.out.println(sumo);
		int d=sumo-sume;
		if(d%11==0)
		{
			System.out.println("Number is Divisible by 11");
		}
	}
}