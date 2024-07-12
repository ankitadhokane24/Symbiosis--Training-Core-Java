//Temperature Conversion Celsius To Fahrenheit And Vice Versa

import java.util.Scanner;

class tempartureCoversion
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int ch=0;
		while(ch!=3)
		{
			System.out.println("1.Celsius to Fahrenheit");
			System.out.println("2. Fahrenheit to Celsius ");
			System.out.println("3.Exit");
			System.out.println("Enter Your choice");
			 ch=s.nextInt();

			switch(ch)
			{
				case 1:
					System.out.println("Enter temperature in celsius:");
					float c=s.nextFloat();
					float F = (9/5)*c +32;
					System.out.println("Celsius to Fahrenheit:"+F);
				break;

				case 2:
					System.out.println("Enter temperature inFahrenheit:");
					float  f=s.nextFloat();
					float cel = (f - 32) * 5/9;
					System.out.println(" Fahrenheit  to Celsius:"+cel);
				break;

				case 3:
					break;
			}
		}
		
	}

}

