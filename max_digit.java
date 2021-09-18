//A program in JAVA to enter a number and display the largest digit  present in it.

import java.util.*;
public class max_digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=n,max=0;
        while(a>0)
        {
            int d=a%10;
            if(d>max)
            {
                max=d;
            }
            a=a/10;
        }
        System.out.println("Largest digit=  "+max);
        sc.close();
    }
}