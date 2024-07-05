//How to Create Objects in Java

class objectdemo
{
	int a=1,b=2;
	void add()
	{
		int sum=a+b;
		System.out.println("Addition of two numbers:"+sum);
	}

}

class objectdemo1
{
	public static void main(String args[])
	{
		objectdemo d=new objectdemo();
		d.add();
	}
}