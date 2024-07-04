import java.util.*;

class Lcm
{
	public static void main(String args[])
	{
		int gcd=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers to find lcm:");
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				 gcd=i;
			}
		}
		int lcm=(a*b)/gcd;
		System.out.println("LCM of two numbers:"+a+" "+b +" is:"+lcm);
		
	}
}