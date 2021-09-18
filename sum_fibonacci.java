/* A program in java to display the sum of fibonacci series upto a certain number.
A fibonacci series is one in which each number ( Fibonacci number )
is the sum of the two preceding numbers. 
The simplest is the series 1, 1, 2, 3, 5, 8, etc. */

import java.util.*;
public class sum_fibonacci {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the last number of the series");
     int l=sc.nextInt();
     int a,b,c,s=0;
        a=0;
        b=1;
        c=1;
        System.out.println("Printing Series");
        System.out.println(a);
        while(c<=l)
        {
            System.out.println(c);
            c=a+b;
            s=s+c;
            a=b;
            b=c;
        }
        System.out.println("The fibonacci series has been completed.");
        System.out.println("The sum of the series=  "+s);
        sc.close();
    }
    
}