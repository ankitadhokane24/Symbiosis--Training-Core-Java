//calculate simple interest
import java.util.Scanner;
class si
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter principal amount:");
		float p=s.nextFloat();

		System.out.println("Enter rate:");
		float r=s.nextFloat();
		
		System.out.println("Enter time:");
		float t=s.nextFloat();

		float SI=(p*r*t)/100;
		System.out.println("Simple interest: "+SI);
	}
}