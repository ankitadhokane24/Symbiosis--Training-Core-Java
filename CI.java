//calculate compound interest
import java.util.Scanner;
public class CI
{
    public static void main(String[] args)
 {
        Scanner s = new Scanner(System.in);

        // Input principal amount
        System.out.println("Enter the principal amount: ");
        double p= s.nextDouble();

        // Input annual interest rate (in percentage)
        System.out.println("Enter the annual interest rate (in %): ");
        double r = s.nextDouble();

        // Input number of years
        System.out.println("Enter the number of years: ");
        int t= s.nextInt();

        // Calculate compound interest
        double a = p * Math.pow(1 + (r / 100), t);
        double ci = a - p;

        // Output the results
        System.out.println("The compound interest is: "+ci);
        System.out.println("The total amount is: "+ a);

    }
}
