/* A program in java to calculate the factorial of a number. */

import java.util.*;
public class factorial {
    static Scanner sc=new Scanner(System.in);
    public static int fact(int fac)
    {
        int a=fac,f=1;
        while(a>0)
        {
            f=f*a;
            a--;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate factorial");
        int fc=sc.nextInt();
        System.out.println("Factorial of the number =  "+fact(fc));
        sc.close();
    }
    
}