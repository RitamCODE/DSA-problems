import java.util.*;
public class power_of_num {
    static int  pow(int n, int b)// let n=5
    {
		if(b==0)
		return 1;

		return n*pow(n,b-1);
		
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
        //System.out.println("enter the number");
        //int n=sc.nextInt();
        //sum (n);
        System.out.println(pow(3,4));
    }
}
