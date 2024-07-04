//Java Programs to Convert a Person's Name in Abbreviated
import java.util.Scanner;

class abbreviation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		char firstname=s.next().charAt(0);

		System.out.println("EnterMiddle Name:");
		char middlename=s.next().charAt(0);

		System.out.println("EnterLast Name:");
		char lastname=s.next().charAt(0);
		
		System.out.println("Abbreviated Name of person:"+firstname+" "+middlename+" "+lastname);

	}
}