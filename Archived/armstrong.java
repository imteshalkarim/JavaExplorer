/*A program in java to check if a number is armstrong number or not.
An armstrong number is one whose sum of cube of its digits is equal to the number.
Ex - 153. 1^3 + 5^3 + 3^3 = 153 */

import java.util.*;
public class armstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt(),s=0,a=n;
        while(a>0)
        {
            int dg=a%10;
            s=s+dg*dg*dg;
            a=a/10;
        }
        if(s==n)
        System.out.println("It is an armstrong number");
        else
        System.out.println("It is not an armstrong number");
        sc.close();
    }    
}