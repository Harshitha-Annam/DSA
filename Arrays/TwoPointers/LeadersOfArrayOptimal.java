import java.util.*;

// Time Complexity - O(n)
// Space Complexity - O(1)



public class LeadersOfArray
{
    public static void getArrayLeaders(int[] arr, int n)
    {
        // Intuition: traverse array in reverse and keep track of running maximum as leader of array
        int curr = arr[n-1];
        System.out.print(curr + " ");
        for(int i = n - 2; i >= 0; i--)
        {
            if(arr[i] > curr)
            {
                System.out.print(arr[i] + " ");
                curr = arr[i];
            }
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
        getArrayLeaders(arr, n);

    }
}