/*A program  to enter a number and display the product of its odd digits, if any.*/
import java.util.*;
public class p3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int a=n,p=1,c=0;
        while(a>0)
        {
            int d=a%10;
            if(d%2!=0)
            {
                c++;
                p=p*d;
            }
            a=a/10;
        }
        if(c==0)
        System.out.println("There are no odd digits in this number");
        else
        System.out.println("Product of odd digits = " +p);
    }
}

