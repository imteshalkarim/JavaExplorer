public class output
{
    public static void main(String args[]) 
    {
        char[]arr = {'a' , 'd', 'f'};
        char target = 'm';
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if (target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                start=mid+1;
            }
        } 
        char ans = arr[start % arr.length];
        System.out.println(ans);
        
    }
}