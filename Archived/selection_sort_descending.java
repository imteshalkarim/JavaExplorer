//A program in java to sort an array of integers in descending order using selection sort technique
import java.util.*;
public class selection_sort_descending
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
        for(int x=0;x<l-1;x++)
        {
            int s=a[x];
            int p=x;
            for(int y=x+1;y<l;y++)
            {
                if(a[y]>s)
                {
                    s=a[y];
                    p=y;
                }
            }
            int t=a[x];
            a[x]=a[p];
            a[p]=t;
        }
        System.out.println("Displaying sorted array");
        for(int x=0;x<l;x++)
        {
            System.out.print(a[x]+"\t");
        }
        sc.close();
    }
}