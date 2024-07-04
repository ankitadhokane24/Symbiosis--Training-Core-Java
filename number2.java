//Java Program to Find Square and Cube of a Number (N^1, N^2, N^3)
import java.util.Scanner;
class number2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int sq=n*n;
		int cube=n*n*n;
		System.out.println("Square of number:"+sq);
		System.ou.println("Cube of number:"+cube);
	}
}