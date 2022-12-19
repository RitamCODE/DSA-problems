// print all divisors of a given number
// divisors means factors(may or may not be prime)
public class print_all_divisors {
    static void find_div_brute(int n)
    {
        System.out.println(1);
        System.out.println(n);
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            System.out.println(i);
        }
    }
    // there is no need of going till n since we will get one factor 
    // at root(n) and the other factor will on the on the other side of root(n)
    
    static void find_div_optimized(int n)
    {
        System.out.println(1);
        System.out.println(n);
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {System.out.println(i);
                if(n/i != i)
            System.out.println(n/i);}
        }
    }// time complexity is theta(root n)
    static void find_div_sorted(int n)
    {
        int i=1;
        for(;i*i<n;i++)// we need not write the initiaLization statement again
        {
            if(n%i==0)
            System.out.println(i);
        }
        for(;i>=1;i--)
        {
            if(n%i==0)
            {
                if(n/i != i)
            System.out.println(n/i);
            }
        }
    }// time complexity is theta(root n)
    public static void main(String args[])
    {
        find_div_brute(30);
        find_div_optimized(30);
        find_div_sorted(30);
    }

}
