import java.util.*;
public class check_digit_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        System.out.println("Enter a digit to check for its presence");
        int dg=sc.nextInt();
        int a=n,c=0;
        while(a>0)
        {
            int d=a%10;
            if(d==dg)
            {
            c++;
            }
            a=a/10;
        }
        if(c>0)
        System.out.println("The digit was found: " + c + " number of times");
        else
        System.out.println("The digit was not found in the number");
        sc.close();
    }
}
