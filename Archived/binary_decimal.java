//A program in java to convert a binary number to its decimal equivalent.
import java.util.*;
public class binary_decimal
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter a binary number to display its decimal equivalent");
        int bno=sc.nextInt();
        binary_to_decimal(bno);
    }
    public static void binary_to_decimal(int no)
    {
        int c=0,a=no;double b=0.0;
        while(a>0)
        {
            int d=a%10;
            if(d!=0)
            b=b+Math.pow(2,c);
            c++;
            a=a/10;
        }
        System.out.println("Its decimal equivalent = " + b);

    }
}