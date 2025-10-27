import java.util.*;

public class LeftRotateArrayByD
{
    public static void reverseArray(int[] arr, int start, int end)
    {
        // for(int i = start; i < end; i++)
        // {
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        // }
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // for(int i = 0; i < arr.length; i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        
    }
    // public static void rotateArray(int[] arr, int n, int d)
    // {
    //     reverseArray(arr, 0, d%n);
    //     for(int i = 0; i < n; i++)
    //     {
    //         System.out.print(arr[i] + " ");
    //     }
    //     reverseArray(arr, d%n, n);
    //     for(int i = 0; i < n; i++)
    //     {
    //         System.out.print(arr[i] + " ");
    //     }
    //     reverseArray(arr, 0, n);
    //     for(int i = 0; i < n; i++)
    //     {
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        // input elements into array
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // rotateArray(arr, n, d);
        d = d % n;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}