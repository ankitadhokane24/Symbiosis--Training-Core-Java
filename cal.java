//Calculator

import java.util.Scanner;

class cal
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int ch=0;
		while(ch!=6)
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulo");
			System.out.println("Enter Your Choice:");
			ch=s.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter two numbers:");
					int a=s.nextInt();
					int b=s.nextInt();
					int add=a+b;
					System.out.println("Addition of two numbers:"+add);
				break;

				case 2:
					System.out.println("Enter two numbers:");
					int a1=s.nextInt();
					int b1=s.nextInt();
					int sub=a1-b1;
					System.out.println("Subtraction of two numbers:"+sub);
				break;

				case 3:
					System.out.println("Enter two numbers:");
					int a2=s.nextInt();
					int b2=s.nextInt();
					int mul=a2*b2;
					System.out.println("Multiplication of two numbers:"+mul);
				break;

				case 4:
					System.out.println("Enter two numbers:");
					int a3=s.nextInt();
					int b3=s.nextInt();
					float div=a3/b3;
					System.out.println("Division of two numbers:"+div);
				break;
				
				case 5:
					System.out.println("Enter two numbers:");
					int am=s.nextInt();
					int mod=am%10;
					System.out.println("Modulo of two numbers:"+mod);
				break;

				case 6:
					break;
			}
		}	
	}
}