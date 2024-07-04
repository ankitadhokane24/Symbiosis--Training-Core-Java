//adding two binary numbers/character
import java.util.*;
class adding
{
	public static void main(String args[])
	{
		char ch1='a',ch2='b';
		String addc=""+ch1+ch2;
		System.out.println("Addition two character:"+ addc);
		
		String a="1101",b="101";
		int n1=Integer.parseInt(a, 2);
		int n2=Integer.parseInt(b, 2);
		int sum=n1+n2;
		String res=Integer.toBinaryString(sum);
		System.out.println("Addition of two binary number:"+res);
		
	}
}