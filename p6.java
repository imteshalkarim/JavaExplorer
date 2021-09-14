/* A program in JAVA to enter a string then display it in reverse and check if it is a palindrome.
A palindrome is a word/sentence that is exactly the same front and backwards.
For example - "madam" */
import java.util.*;
public class p6 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.next();   
        String rs="";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            rs=ch+rs;
        } 
        if(rs.equalsIgnoreCase(s))
        System.out.println("It is a palindrome:" + rs);
        else
        System.out.println("Not a palindrome:    "+rs);
        sc.close();
    }
}