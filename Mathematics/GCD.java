// gcd meands the greatest common divisor among two numbers
import java.util.*;
class GCD
{
    static int gcd_brute(int a, int b)
    {
        // here the time complexity is O(min(a,b))
        int min=0;
        if(a>b)
        min=b;
        if(b>a)
        min=a;
        for(int i=min;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            return i;
        }
        return -1;
    }
    static int euclid_gcd(int a, int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            if(a<b)
            {
                b=b-a;
            }
        }
        return a;
    }

    static int optimised_euclid_gcd(int a, int b)
    {
        if(a<b) return optimised_euclid_gcd(b, a);
        if(b==0) return a;

        return optimised_euclid_gcd(a%b, b);
    }
    public static void main(String args[])
    {
        // System.out.println(gcd_brute(24, 36));
        //System.out.println(euclid_gcd(7, 2));
        System.out.println(optimised_euclid_gcd(4, 180));
    }
}