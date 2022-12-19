import java.util.*;
public class Sieve_of_eratosthenes {
    // program to print the prime numbers from 1 to n
    static void prime(int n)
    {
        boolean isprime[]=new boolean[n+1];
        // we are taking n+1 so that the index can be till n
        // this is basically a boolean array which stores whether a number is 
        // prime or not
        // initially we are assigning each value of this array as true

        Arrays.fill(isprime,true);
        // inbuilt collections framework function for filling the array
        
        for(int i=2;i*i<n;i++)// same logic used as opitimised prime number
        {
            if(isprime[i])
            {
                for(int j=2*i;j<=n;j=j+i)
                // the loop is initialised at 2i since at all the multiples of
                // 2 will not be a prime number
                // then loop jumps by i times so as to find all the possible
                // multiples of i (if i=2, multiples off 2 are 2+i=4, 4+i=6.... )
                // same is the case for other numbers
                // therefore all multiples of i are marked false
                // the remaining numbers after the end of the loop are prime
                {
                    isprime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(isprime[i])
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        prime(20);
    }
}
