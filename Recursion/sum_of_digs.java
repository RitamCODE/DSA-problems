// find the sum of digits of a number using recusrsion 

import java.util.*;
class sum_of_digs
{
    static int sum_it(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
    }
    static int sum_rec(int n,int s)// sum of digs using recursion
    {
        if(n==0)
        return 0;

        return s + (n%10) + sum_rec(n/10, s);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the value of n and m");
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        System.out.println( sum_it(23));
        System.out.println( sum_rec(23,0));
    }
}

// time complexity = O(log n)

// recursive leap of faith = lastdig + sum(n/10)
// 2314 
// 4 + 231
// i.e., if we can find the recursive leap of faith then we do the entire recursive code