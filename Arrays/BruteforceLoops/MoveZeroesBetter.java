import java.util.*;

// Time Complexity - O(n)
// Space Complexity - O(n)



public class MoveZeroesBetter
{
    public static void moveZereos(int[] arr, int n)
    {
        // Intuition: create a new array, loop through given array and add non zero elements to new array
        int[] newArr = new int[n];
        int idx = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                newArr[idx] = arr[i];
                idx += 1;
                
            }
        }

        for(int i  = 0; i < n; i++)
        {
            System.out.print(newArr[i] + " ");
        }
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
        moveZereos(arr, n);

    }
}