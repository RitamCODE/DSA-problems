public class tower_of_hanoi {
    static void tower(int n,char from,char to,char aux)
    {
        if(n==0)
        return;
        tower(n-1,from,aux,to);
        System.out.println("Move"+n+"from"+from +"to"+to);
        tower(n-1, aux, to, from);
    }
    public static void main(String args[])
    {
        tower(3, 'A', 'B', 'C');
    }
}
