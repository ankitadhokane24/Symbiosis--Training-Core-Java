//swapping two numbers without using third variable
class swapping1
{
	public static void main(String args[])
	{
		int a=6,b=2;
		System.out.println("Before swapping value of a:"+a);
		System.out.println("Before swapping value of b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println();
		System.out.println("After swapping value of a:"+a);
		System.out.println("After swapping value of b:"+b);

	}
}