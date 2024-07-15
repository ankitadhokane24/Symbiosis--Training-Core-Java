import java.util.Scanner;

class sortArray 
{
   	 public static void main(String args[]) 
   	{
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter size of array:");
        	int n = s.nextInt();
        	int a[] = new int[n];
        
        	System.out.println("Enter Array Elements:");
        	for (int i = 0; i < n; i++) 
		{
            		a[i] = s.nextInt();
       		}
        
           for (int i = 0; i < n - 1; i++) 
	  {
            	for (int j = 0; j < n - 1 - i; j++) 
		{
                	if (a[j] > a[j + 1]) 
			{
              			int temp = a[j];
                    		a[j] = a[j + 1];
                    		a[j + 1] = temp;
                	}
            	}
        }
        
        System.out.println("Sorted Array in Ascending Order:");
        for (int i = 0; i < n; i++) 
	{
            System.out.print(a[i] + "\t");
        }
    }
}
