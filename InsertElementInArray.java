//Insert An Element Desired or Specific Position In An Array
import java.util.Scanner;

 class InsertElementInArray 
{
	public static void main(String[] args) 
	{
        		Scanner s= new Scanner(System.in);
                   System.out.println("Enter the size of the array: ");
                   int n = s.nextInt();
                   int[] a = new int[n + 1];
        
                  System.out.println("Enter elements of the array:");
                  for (int i = 0; i < n; i++) 
   	       {
                          a[i] = s.nextInt();
                 }
        
              	System.out.println("Enter the element to be inserted: ");
        		int element = s.nextInt();
        		System.out.println("Enter the position at which to insert the element: ");
        		int position = s.nextInt();
        
      		for (int i = n; i > position; i--) 
		{
            		a[i] = a[i - 1];
        		}
        		a[position] = element;
        
                System.out.println("Array after insertion:");
        	      for (int i = 0; i <= n; i++) 
	     {
            		System.out.print(a[i] + " ");
       	     }
    	}
}
