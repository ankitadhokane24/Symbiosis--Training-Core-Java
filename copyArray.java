//copy one array elements into another array

import java.util.Scanner;

 class copyArray 
{    
 	public static void main(String[] args) 
	{    
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size array:");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[a.length];
		
		System.out.println("Enter Elements of first array:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
    		System.out.println("Original Array");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		for (int i = 0; i < n; i++) 
		{     
            		b[i] = a[i];     
        		}
		 System.out.println("\nAfter copying array into another array: ");    
        		for (int i = 0; i <n; i++) 
		{     
           		System.out.print(b[i] + "\yt");    
        		}     
          }    
}    