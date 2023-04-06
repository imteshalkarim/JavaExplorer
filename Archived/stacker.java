//A program in java to accept an integer arrar and then push it into an integer stack.

import java.util.*;
public class stacker
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter length of array");
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int x=0;x<l;x++)
        {
            System.out.println("Enter an integer");
            a[x]=sc.nextInt();
        }
        Stack<Integer> stk=new Stack<>();
        System.out.println("Beginning to push elements");
        for(int y=0;y<l;y++)
        {
            stk.push(a[y]);
        }
        System.out.println("Elements in stack: "+stk);
        sc.close();
    }
}