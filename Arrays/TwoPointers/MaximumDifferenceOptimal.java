import java.util.*;

public class MaximumDifferenceOptimal {

    public static int getMaximumDifference(int[] nums, int n)
    {
        int maxDiff = -1;
        int minEl = nums[0];
        // int n = nums.length;
        for(int i = 1; i < n; i++)
        {
            if(nums[i] < minEl)
            {
                minEl =  nums[i];
            }
            else{
                int diff = nums[i] - minEl;
                if(diff > maxDiff)
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