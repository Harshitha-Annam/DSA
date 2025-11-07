import java.util.*;

public class TrappingRainWater
{

    public static int getStoredWater(int[] arr, int n)
    {
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];
        for(int i = 1; i < n; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        for(int i = n-2; i >=0; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        int stored = 0;
        for(int i = 1; i <= n-2; i++)
        {
            int mv = Math.min(leftMax[i], rightMax[i]);
            int cw = mv-arr[i];
            if(cw > 0)
            {
                stored += cw;
            }
        }
        return stored;
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
        System.out.println(getStoredWater(arr, n));
    }
}