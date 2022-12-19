// generate all subsets/subsequences of a string using recursion
//abc
// "" 
//a
//b
//c
//ab
//bc
//ac
//abc
 


import java.util.*;
public class string_subsequence {
    static void sequences(String s, int i, String curr)
    // s-> the original string / i-> current index / curr-> current string 
    {
        if(i==s.length())
        {
            System.out.println(curr);
            return;
        }
        sequences(s, i+1, curr);// adding space
        sequences(s, i+1, curr+s.charAt(i)); // adding the next character
        // for example the subproblem is ab
        // then we can either add ab+"" or ab+c 
        // this is how we find all possible substrings
    }
    public static void main(String args[])
    {
        //string_subsequence ob = new string_subsequence()
        sequences("abc",0,"");
    }
}
