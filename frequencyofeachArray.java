//Java Program to find the frequency of each element in the array
import java.util.Scanner;

 class frequencyofeachArray
{    
 	public static void main(String[] args) 
	{    
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size array:");
		int n=s.nextInt();
		int a[]=new int[n];
		int freq[]=new int[a.length];
		System.out.println("Enter Elements of first array:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		int v=-1;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=v;
				}
			}
			if(freq[i]!=v)
			{
				freq[i]=count;
			}
		}
		System.out.println("Frequency of each element.");
		for(int i=0;i<n;i++)
		{
			if(freq[i]!=v)
			{
				System.out.println("    "+a[i]+"-->"+freq[i]);
			}
		}
	}
}