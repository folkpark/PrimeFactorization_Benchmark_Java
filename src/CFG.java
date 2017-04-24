// Program to print all prime factors
import java.io.*;
import java.lang.Math;
 
class CFG
{
    // A function to print all prime factors
    // of a given number n
    public static void Factor(int n)
    {
        // Print the number of 2s that divide n
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
 
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2)
            System.out.println();
    }
 
    public static void main (String[] args)
    {
    	int trials = 102;
    	for(int i=0;i<trials;i++){
    		long start = System.nanoTime();
    		Factor(1369592039);
    		long end = System.nanoTime();
    		long duration = end - start;
    		System.out.print(duration);
    	}
    }
}
