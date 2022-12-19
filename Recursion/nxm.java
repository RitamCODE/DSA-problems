// letture 1 recursion from unacademy course
// find the number of paths in an nxm matrix
// we can move only right or left side of a particular cell


import java.util.*;
class nxm
{
    static int countPathsInAMatrix(int n,int m)
    {
        if(n==1||m==1)
        return 1;
        

        int right=countPathsInAMatrix(n, m-1); // to the calculate the right path
        int left=countPathsInAMatrix(n-1, m); // to the calculate the left path
        return right + left;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n and m");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println( countPathsInAMatrix(n, m));
    }
}