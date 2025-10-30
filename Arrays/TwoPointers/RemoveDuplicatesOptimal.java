import java.util.*;

public class RemoveDuplicatesOptimal
{
    public static void removeDuplicates(int[] arr, int n)
    {
        int left = 0;
        int right  = 1;
        while(right < n)
        {
            if(arr[right] != arr[left])
            {
                left += 1;
                arr[left] = arr[right];
            }
            right += 1;
        }

        for(int i = 0; i < left+1; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        removeDuplicates(arr, n);

    }
}