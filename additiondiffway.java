//Add two integer variables in 5 different ways using functions and control statement
import java.util.Scanner;

class additiondiffway
{
	static int a, b;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		 a=s.nextInt();
		 b=s.nextInt();
		add();
		add3(a,b);		
		int res1=add1();
		int res=add2(a,b);
		System.out.println("Addition using return type :"+res1);
		System.out.println("Addition using return type with paramters:"+res);
		
	}

	public static void add()
	{
		int sum=a+b;
		System.out.println("Addition using void function:"+sum);
	}

	public static void add3(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition using void function with paramters:"+sum);
	}


	public static int add1()
	{
		int sum=a+b;
		return sum;
	}
	
	public static int add2(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}
