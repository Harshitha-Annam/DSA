import java.util.*;

public class MaximumDifference {

    public static int getMaximumDifference(int[] nums, int n)
    {
        int maxDiff = -1;
        // int n = nums.length;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int diff = nums[j] - nums[i];
                if(diff > maxDiff && nums[i] < nums[j])
                {
                    maxDiff = diff;
                }
            }
        }

        return maxDiff;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        // System.out.println(nums.length);
        
        // Entering elements into array

        for(int i = 0; i < n; i++)
        {
            int el = sc.nextInt();
            nums[i] = el;
        }

        // finding maximum difference between increasing elements
        System.out.println(getMaximumDifference(nums, n));
    }
}