import java.util.*;

public class ReverseArray {
    public static int[] getReversedArray(int[] arr, int n)
    {
        int[] newarr = new int[n];

        for(int i = 0; i < n; i++)
        {
            newarr[i] = arr[n-i-1];
        }

        return newarr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input elements into array

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
         int[] ans = getReversedArray(arr, n);

         for(int i = 0; i < n; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}