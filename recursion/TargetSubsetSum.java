import java.util.*;

public class TargetSubsetSum
{
    public static boolean getSubset(int[] arr, int n, int target, int curr, int idx)
    {
        if(idx == arr.length) return target == curr;
        return target == curr || getSubset(arr, n, target, curr + arr[idx], idx + 1) || getSubset(arr, n, target, curr, idx + 1);

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
        int target = sc.nextInt();
        System.out.println(getSubset(arr, n, target, 0, 0));

    }
}