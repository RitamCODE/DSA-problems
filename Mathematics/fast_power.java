// calculate power of a number in optimized manner using recursion
public class fast_power {
    static int power(int a,int b)
    {
        if(b==0)// base case
        return 1;
        int halfRes = power(a, b/2);
        int fullRes = halfRes * halfRes;
        if(b%2 != 0) fullRes= fullRes*a;// since for odd power after \
        // dividing by 2 we get eg 3/2 = 1 ..... i.e., one factor is lost
        // therfore we are multiplying that 
        return fullRes;
        // time complexity of this code should be log n 
    }
    public static void main(String args[])
    {
        System.out.println(power(2,3));
    }
}
