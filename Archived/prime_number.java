/*A program in java to check if a number is prime or not.
A prime number is one which has no other factors except 1 and the number itself.
Ex- 23 */

import java.util.*;
public class prime_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(),c=0;
        for(int f=1;f<=n;f++)
        {
            if(n%f==0)
            c++;
        }    
        if(c==2)
        System.out.println("It is a prime number");
        else
        System.out.println("Not a prime number");
        sc.close();
    }
}