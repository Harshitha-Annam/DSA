import java.util.*;

public class MaximumSubArraySum
{
    public static int getMaximumSum(int[] arr, int n)
    {
        int max_sum = Integer.MIN_VALUE;
        // kadanes algorithm
        int curr_sum = 0;
        for(int i = 0; i < n; i++)
        {
            curr_sum += arr[i];
            if(curr_sum > max_sum) max_sum = curr_sum;

            if(curr_sum < 0)
            {
                curr_sum = 0;
            }
        }
        return max_sum;
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
        System.out.println(getMaximumSum(arr, n));
    }
}