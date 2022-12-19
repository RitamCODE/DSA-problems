public class LCM {
    static int optimised_euclid_gcd(int a, int b)
    {
        if(a<b) return optimised_euclid_gcd(b, a);
        if(b==0) return a;

        return optimised_euclid_gcd(a%b, b);
    }
    static int find_lcm(int a, int b)
    {
        return ((a*b)/optimised_euclid_gcd(a,b));
        // LCM = (a*b)/gcd of the numbers
    }
    public static void main(String args[])
    {
        // System.out.println(gcd_brute(24, 36));
        //System.out.println(euclid_gcd(7, 2));
        System.out.println(find_lcm(24, 36));
    }
}
