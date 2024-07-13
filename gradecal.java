//Find A Grade Of Given Marks or (Find a Grade of Given Marks Using Switch Case)

import java.util.Scanner;

class gradecal
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks between 0 to 100");
		System.out.println("Enter Marks:");
		int m=s.nextInt();

		if(m>100)
		{
			System.out.println("Enter marks between limit");
		}
		else
		{
			switch(m/10)
			{
				case 10:
				break;
				
				case 9:
					System.out.println("Your Grade is A");
				break;
				
				case 8:
					System.out.println("Your Grade is B");
				break;
				
				case 7:
					System.out.println("Your Grade is C");
				break;

				case 6:
					System.out.println("Your Grade is D");
				break;
				
				case 5:
					System.out.println("Your Grade is E");
				break;
			
				case 4:
					System.out.println("Your Grade is E--");
				break;
		
				default:
                				System.out.println("Your Grade is Fail..");
				
			}
		}
	}
}