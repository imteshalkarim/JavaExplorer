//A program in JAVA to enter a number and display the smallest digit  present in it

import java.util.*;
public class smallest_digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=n,min=9;
        while(a>0)
        {
            int d=a%10;
            if(d<min)
            {
                min=d;
            }
            a=a/10;
        }
        System.out.println("Smallest digit=  "+min);
        sc.close();
    }
}