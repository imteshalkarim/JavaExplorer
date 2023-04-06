//A program in java to convert a decimal number to binary.
import java.util.*;
public class decimal_binary
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter a decimal number to display its binary equivalent");
        int dno=sc.nextInt();
        decimal_to_binary(dno);
    }
    public static void decimal_to_binary(int n)
    {
        String d="";
        while(n>0)
        {
            int a=n%2;
            d=a+d;
            n=n/2;
        }
        int dc=Integer.parseInt(d);
        System.out.println("Its binary equivalent = " + dc);
    }
}