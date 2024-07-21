//Java Program to Find 3rd Largest Number in an array
import java.util.Scanner;
 class thirdlargeArray 
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
		System.out.println("3rd largest element in array:"+a[n-3]);
	}
}