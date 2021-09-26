//A program in java to reverse a string
import java.util.*;
public class rev_string 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string to reverse");
       String s=sc.nextLine(),ns="";
       s.trim();
       for(int x=0;x<s.length();x++)
       {
           char ch=s.charAt(x);
           ns=ch+ns;
       }
       System.out.println("Reversed string =   "+ns);
       sc.close();
    }    
}