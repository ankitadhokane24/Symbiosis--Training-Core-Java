//Java Program to right rotate the elements of an array
import java.util.Scanner;

public class rightrotate 
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

   	        	System.out.print("Enter number of left rotations: ");
        	       	int r = s.nextInt();

                	for (int i = 0; i < r; i++) 
	         {
            		int last = a[a.length-1];
            		for (int j=a.length-1;j>0;j--)
			{
                			a[j]=a[j - 1] ;
           		}
            		a[0]=last;
        		}

                System.out.println("Array after " + r + " right rotations:");
                for (int i = 0; i < n; i++) 
	     {
            		System.out.print(a[i] + " \t");
        	      }
    	}
}
