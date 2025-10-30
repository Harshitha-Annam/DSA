import java.util.*;

// Time Complexity - O(n)
// Space Complexity - O(1)



public class MoveZeroesBetter
{
    public static void moveZereos(int[] arr, int n)
    {
        // Intuition: two pointers, one to track the next index where the non zero element is to be inserted
        //  and another one to iterate through array in search of non zero elements
        int left = 0;
        int right = 0;
        // while(right < n)
        // {
        //     if(arr[right] != 0)
        //     {
        //         int temp = arr[left];
        //         arr[left] = arr[right];
        //         arr[right] = temp;
        //         left += 1;
        //     }
        //     right += 1;

        // }
        int idx = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx += 1;
            }
        }

        for(int i  = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
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