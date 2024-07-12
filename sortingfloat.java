//Sort A Float Array In Ascending And Descending Order Using

import java.util.Scanner;

class sortingfloat
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter Size of Array:");
		int n=s.nextInt();*/
		float f[]=new float[5];
		System.out.println("Enter Numbers:");
		for(int i=0;i<5;i++)
		{
			f[i]=s.nextFloat();
		}
		
		System.out.println("\nArray Elements");
		for(int i=0;i<5;i++)
		{
			System.out.print(f[i]+"\t");
		}
		
		for(int i=0;i<5-1;i++)
		{
			for(int j=0;j<5-1-i;j++)
			{
				if(f[j]>f[j+1])
				{
					float temp=f[j];
					f[j]=f[j+1];
					f[j+1]=temp;	
				}
			}
		}

		System.out.println("\nAscending Array");
		for(int i=0;i<5;i++)
		{	
			System.out.print(f[i]+"\t");
		}

		for(int i=0;i<5-1;i++)
		{
			for(int j=0;j<5-1-i;j++)
			{
				if(f[j]<f[j+1])
				{
					float temp=f[j];
					f[j]=f[j+1];
					f[j+1]=temp;	
				}
			}
		}
		System.out.println("\nDescending Array");
		for(int i=0;i<5;i++)
		{	
			System.out.print(f[i]+"\t");
		}
	}
}