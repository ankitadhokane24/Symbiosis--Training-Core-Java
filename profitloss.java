//profit or loss

import java.util.Scanner;
class profitloss
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Cost Price :");
		int cp = input.nextInt();
		System.out.println("Enter The Selling Price :");
		int sp = input.nextInt();
		int p,l;		
		if(sp>cp)
		{
			p = sp-cp;
			System.out.println("Profit : "+p);
		}
		else if(sp<cp)
		{
			l = cp-sp;
			System.out.println("Loss : "+l);	
		}
		else
		{
			System.out.println("No Profit No Loss");
		}
	}
}