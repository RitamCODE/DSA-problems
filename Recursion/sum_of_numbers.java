import java.util.*;
public class sum_of_numbers {
    static int  sum(int n)// let n=5
    {
		if(n==0)
		return 0;

		return n + sum(n-1);
		
        // how recursion is working here

        // n   sum()   return
        // 5   5       15
        // 4   4       10
        // 3   3       6
        // 2   2       3
        // 1   1       1
        // 0   0       0

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        //sum (n);
        System.out.println(sum(n));
    }
}
