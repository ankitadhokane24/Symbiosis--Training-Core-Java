//Delete Element From Array At Desired Or Specific Position

import java.util.Scanner;

class DeleteElementFromArray 
{
	public static void main(String[] args) 
	{
        		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
       		int n = s.nextInt();
        		int[] array = new int[n];

        		System.out.println("Enter  elements of the array:");
        		for (int i = 0; i < n; i++) 
		{
           		 array[i] = s.nextInt();
        		}

       	 	System.out.print("Enter the position  of the element to be deleted: ");
        		int position = s.nextInt();

        		if (position < 0 || position >= n) 
		{
           		 System.out.println("Invalid position");
       		} 
		else 
		{
            		for (int i = position; i < n - 1; i++) 
			{
                			array[i] = array[i + 1];
           		}
            		n--;

            		System.out.println("Array after deletion:");
            		for (int i = 0; i < n; i++) 
			{
               		 	System.out.print(array[i] + " ");
            		}
        		}
    	}
}
