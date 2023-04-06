/* A program in JAVA to enter a number and reverse it along with checking if the number is a palindrome or not. */
import java.util.*;
public class palindrome_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a=n,rn=0;
        while(a>0)
        {
            int dg=a%10;
            rn=rn*10+dg;
            a=a/10;
        }    
        if(rn==n)
        System.out.println("The number is a palindrome:    "+rn);
        else
        System.out.println("The number when reversed =    "+rn);
        sc.close();
    }    
}