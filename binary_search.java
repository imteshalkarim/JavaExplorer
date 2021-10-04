//A program in java to search for an integer in an integer array using binary search technique.

import java.util.*;
public class binary_search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int x=0;x<l;x++)
        {
            System.out.println("Enter a number");
            a[x]=sc.nextInt();
        }
        System.out.println("Enter a number to be searched");
        int n=sc.nextInt();
        int first=0,last=l-1,position=0;
        while(first<=last)
        {
            int m=(first+last)/2;
            if(a[m]==n)
            {
                position=m+1;
                break;
            }
            if(a[m]<n)
            {
                first=m+1;
            }
            if(a[m]>n)
            {
                last=m-1;
            }
        }
        if(position == 0)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at position: "+position);
        }
        sc.close();
    }
}