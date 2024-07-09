//Find all roots of a quadratic equation.
import java.util.Scanner;

class qudaracticroots
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);

       		 System.out.print("Enter coefficient a: ");
        		double a = s.nextDouble();

       		 System.out.print("Enter coefficient b: ");
        		double b = s.nextDouble();

        		System.out.print("Enter coefficient c: ");
        		double c = s.nextDouble();

    
        		double discriminant = b * b - 4 * a * c;

       		 if (discriminant > 0)
		{
                    	double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            	   	double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            		System.out.println("The roots are real and different.");
            		System.out.println("Root 1: " + root1);
            		System.out.println("Root 2: " + root2);
       		 } 
		else if (discriminant == 0)
		{
                      	double root = -b / (2 * a);
            		System.out.println("The roots are real and the same.");
           		 System.out.println("Root: " + root);
       		} 
		else
		{
                       	double realPart = -b / (2 * a);
            		double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
           		System.out.println("The roots are complex and different.");
            		System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            		System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
       		 }

            }
}
