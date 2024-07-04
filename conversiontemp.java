//Java Programs For Converting Temperature Celsius Into Fahrenheit
import java.util.Scanner;
class conversiontemp
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temperature in Celsius:");
		int c=s.nextInt();
		
		float f=((c*9)/5)+32;
		System.out.println("Temperature in fahrenheit:"+f);
	}
}