//Java Program to sort the elements of an array in ascending order
import java.util.Scanner;
 class ascendingsortArray 
{
    	public static void main(String[] args) 
	{
        		Scanner s = new Scanner(System.in);
                   System.out.print("Enter size of array: ");
        		int n = s.nextInt();
        		int[] a= new int[n];
        
		System.out.println("Enter elements of the array:");
        		for (int i = 0; i < n; i++) 
		{

            		a[i] = s.nextInt();
       		}
		
		System.out.println("Array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending order:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}