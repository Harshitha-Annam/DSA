import java.util.*;

public class CheckSorted 
{
    public static void isSorted(int[] arr, int n)
    {
        boolean sorted = true;
        for(int i = 1; i < n; i++)
        {
            if(arr[i-1] > arr[i])
            {
                sorted = false;
                break;
            }
        }
        if(sorted)
        {
            System.out.println("The given array is sorted.");
        }
        else
        {
            System.out.println("The given array is not sorted.");
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

        isSorted(arr, n);
    }
}