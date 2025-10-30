import java.util.*;

// Time Complexity - O(n^2)
// Space Complexity - O(1)



public class LeadersOfArray
{
    public static void getArrayLeaders(int[] arr, int n)
    {
        // Intuition: for each element check if the elements to its right are smaller then it
        for(int i = 0; i < n; i++)
        {
            boolean isLeader = true;
            for(int j =  i + 1; j < n; j++)
            {
                if(arr[j] > arr[i])
                {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader)
            {
                System.out.print(arr[i] + " ");
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