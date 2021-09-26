//A program in java to check if there are any repeated characters in a string.
import java.util.*;
public class repeated_character 
{
    static Scanner sc=new Scanner(System.in);
    static String s;
    public static void main(String args[])
    {
        System.out.println("Enter a string to check");
        s=sc.next();
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch!=32)
            checker(ch);
        }
        cleaner();
    }
    public static void checker(char c)
    {
        int count=0;
        for(int y=0;y<s.length();y++)
        {
            char ch=s.charAt(y);
            if(ch==c)
            count++;
        }
        if(count>=2)
        {
        System.out.println("Repeated characters are found");
        System.exit(0);
        }
    }
    public static void cleaner()
    {
    System.out.println("Repeated characters are not found");
    }
}