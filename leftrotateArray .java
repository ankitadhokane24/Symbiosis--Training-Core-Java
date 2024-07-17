//Java Program to left rotate the elements of an array
import java.util.Scanner;

public class leftrotateArray 
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
            		int first = a[0];
            		for (int j = 1; j < n; j++) 
			{
                			a[j - 1] = a[j];
           		}
            		a[n - 1] = first;
        		}

                System.out.println("Array after " + rotations + " left rotations:");
                for (int i = 0; i < n; i++) 
	     {
            		System.out.print(a[i] + " \t");
        	      }
    	}
}
