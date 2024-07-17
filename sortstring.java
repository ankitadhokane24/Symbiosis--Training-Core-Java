//Sort strings in alphabetical order

import java.util.Scanner;

class sortstring
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of string:");
		int n=s.nextInt();
		s.nextLine();
		
		String[] s1=new String[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter String"+(i+1)+ ":");
			s1[i]=s.nextLine();
		}
		System.out.println("Original array");
		for(String str:s1)
		{
			System.out.print(str+" ");
		}

        		for (int i = 0; i < n - 1; i++) 
		{
            		for (int j = 0; j < n - i - 1; j++) 
			{
                			if (s1[j].compareTo(s1[j + 1]) > 0) 
				{
                                        	String temp = s1[j];
                    			s1[j] = s1[j + 1];
                    			s1[j + 1] = temp;
                			}
           		}
        		}
		System.out.println("\nSorted array:");
		for (String str : s1) 
		{
            		System.out.print(str + " ");
        		}
	}
}