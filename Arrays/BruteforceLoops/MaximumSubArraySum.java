import java.util.*;

public class MaximumSubArraySum
{
    public static int getMaximumSum(int[] arr, int n)
    {
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            int curr_sum = 0;
            for(int j = i; j < n; j++)
            {
                curr_sum += arr[j];
                if(curr_sum > max_sum)
                {
                    max_sum = curr_sum;
                }
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