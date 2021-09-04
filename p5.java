/* A program in java to reverse a number */
import java.util.*;
public class p5
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
    System.out.println("Enter any number");
        int n=in.nextInt();
        int a=n,r=0;
        while(a>0)
        {
            int d=a%10;
            r=r*10+d;
            a=a/10;
        }
    System.out.println("Reversed number is = "+r);
    in.close();
    }
}