public class prime {
    static boolean prime_brute(int n)
    {
        if(n==1)
        return false;
        if(n==0)
        return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    // if a number is not prime then at least one of its factors might be 
    // found before root n 
    // so we can limit the loop till root n
    // let us consider a pair of number a,b such that a<=b
    // which multiplies to give n , i.e., n=a*b
    // so, a*a <= n
    // so, a <= sqrt(n)
    // therefore atleast one factor of n will found till sqrt n
    
    static boolean prime_brute_optimized(int n)
    {
        if(n==1)
        return false;
        if(n==0)
        return false;
        for(int i=2;i<=(int)Math.sqrt((double)n);i++)
        {
            // we can also give the condition part as i*i<=n
            // which gives the same meaning as above
            if(n%i==0)
            return false;
        }
        return true;
    }

    // for a more optimised version we can remove the multiples of 2, since 
    // a factor that is a multiple of 2 will be divisible by 2 and this 
    // condition can be checked in the first iteration of the loop only
    // therfore there is no need of keeping even numbers
    static boolean prime_brute_more_optimized(int n)
    {
        if(n==1)
        return false;
        if(n==0)
        return false;
        if(n!=0 && n!=1 && (n%2==0))
        return true;
        int i=2;
        while((n%i==0)&& i<n)
        {
            i++;
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println(prime_brute(33));
        System.out.println(prime_brute_optimized(31));
        System.out.println(prime_brute_more_optimized(31));
    }
}
