/* A program in JAVA to check if two entered strings are anagrams or not. 
An anagram is a word formed from all letters of another word 
or
When two words have exactly the same alphabets and length
Example 'rasp' and 'spar'*/

import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String a=sc.nextLine();
        System.out.println("Enter second string");
        String b=sc.nextLine();
        int la=a.length(),lb=b.length();
        if(la==lb)
        {
            int c=0;
            for(int x=0;x<la;x++)
            {
                char chx=a.charAt(x);
                for(int y=0;y<lb;y++)
                {
                    char chy=b.charAt(y);
                    if(chx==chy)
                    c++;
                }
            }
            if(c==la)
            System.out.println("Is an anagram");
            else
            System.out.println("Not an anagram");
        }
        else
        {
            System.out.println("Strings are of unequal length");
        }
        sc.close();
    }   
}