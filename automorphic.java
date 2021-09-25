/* A program in java to check whether a given number is automorphic or not.
An automorphic number is an integer whose square ends with the given integer, as (25)^2 = 625, and (76)^2 = 5776. */

import java.util.*;
public class automorphic
{
    static Scanner sc=new Scanner(System.in);
    public static boolean auto(int n)
    {
        int a=n,ld=(n*n)%10;
            int dg=a%10;
            if(dg==ld)
            return true;
            else
            return false;
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        int no=sc.nextInt();
        if(auto(no))
        System.out.println("It is an automorphic number");
        else
        System.out.println("Not an automorphic number");
        sc.close();
    }
}