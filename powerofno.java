//Read Integer (N) and Print the First Three Powers (N^1, N^2, N^3)
import java.util.Scanner;

class powerofno
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to find power:");
		int n=s.nextInt();
		
		int fpower=n;
		System.out.println("First power ofnumber:"+fpower);

		int spower=n*n;
		System.out.println("Second power ofnumber:"+spower);

		int tpower=n*n*n;
		System.out.println("Third power ofnumber:"+tpower);
	}
}
