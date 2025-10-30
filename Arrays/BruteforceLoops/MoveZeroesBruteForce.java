import java.util.*;

// Time Complexity - O(n^2)
// Space Complexity - O(1)



public class MoveZeroesBruteForce
{
    public static void moveZereos(int[] arr, int n)
    {
        // Intuition: for every zero element run a loop to find the first non zero element on its right and swap

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == 0)
            {
                boolean swapped = false;
                for(int j = i + 1; j < n; j++)
                {
                    if(arr[j] != 0)
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        swapped = true;
                        break;
                    }
                }
                if(!swapped)
                {
                    break;
                }
                
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