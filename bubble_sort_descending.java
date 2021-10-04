//A program in java to sort an array of integers in ascending order using bubble sort technique
import java.util.*;
public class bubble_sort_descending
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
        for(int x=0;x<l;x++)
        {
            for(int y=0;y<l-x-1;y++)
            {
                if(a[y]<a[y+1])
                {
                    int t=a[y];
                    a[y]=a[y+1];
                    a[y+1]=t;
                }
            }
        }
        System.out.println("Displaying sorted array");
        for(int x=0;x<l;x++)
        {
            System.out.print(a[x]+"\t");
        }
        sc.close();
    }
}