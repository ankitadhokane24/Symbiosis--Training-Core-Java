//Add two Matrix using Multi-dimensional Arrays

import java.util.Scanner;

public class AddMatrices
{
    	public static void main(String[] args) 
	{
        	Scanner s = new Scanner(System.in);
        	System.out.println("Enter the number of rows and columns of the matrices:");
        	int rows = s.nextInt();
        	int cols = s.nextInt();
        
        	int[][] matrix1 = new int[rows][cols];
        	int[][] matrix2 = new int[rows][cols];
        	int[][] sumMatrix = new int[rows][cols];
        
             System.out.println("Enter the elements of the first matrix:");
             for (int i = 0; i < rows; i++) 
	    {
            	    for (int j = 0; j < cols; j++) 
		   {
                	matrix1[i][j] = s.nextInt();
            	   }
           }
        
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) 
	{
            	for (int j = 0; j < cols; j++) 
	   	{
                	matrix2[i][j] = s.nextInt();
            	}
        }
        
         for (int i = 0; i < rows; i++) 
	{
            	for (int j = 0; j < cols; j++) 
	   	{
                	sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            	}
      	}
        
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) 
	{
            	for (int j = 0; j < cols; j++) 
		{
                	System.out.print(sumMatrix[i][j] + "\t");
            	}
            	System.out.println();
        	}
    	}
}
