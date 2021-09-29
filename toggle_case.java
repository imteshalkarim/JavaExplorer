/*A program in java to accept a sentence and switch its case before displaying.*/
import java.util.*;
public class toggle_case
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any sentence");
        String s=sc.nextLine(),str="";
        for(int x=0;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(ch>='A'&&ch<='Z')
            {
                int c=(int)ch+32;
                ch=(char)c;
            }
            else if(ch>='a'&&ch<='z')
            {
                int c=(int)ch-32;
                ch=(char)c;
            }
            str=str+ch;
            
        }
        System.out.println("Sentence in toggle case:  " +str);
        sc.close();
    }    
}