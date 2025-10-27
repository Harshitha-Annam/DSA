import java.util.*;

public class ReverseArray {
    public static void getReversedArray(int[] arr, int n)
    {
        int start = 0;
        int end = n - 1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        
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
        getReversedArray(arr, n);

         for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}