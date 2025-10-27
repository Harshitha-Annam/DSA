import java.util.*;

public class LeftRotateBy1

{
    public static void rotateArray(int[] arr, int n)
    {
        int temp = arr[0];
        for(int i = 1; i <=n-1; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
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

        rotateArray(arr, n);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}