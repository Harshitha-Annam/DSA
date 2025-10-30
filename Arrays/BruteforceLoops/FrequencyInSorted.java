import java.util.*;

// Time Complexity - O(n^2)
// Space Complexity - O(1)



public class FrequencyInSorted
{
    public static void getFrequency(int[] arr, int n)
    {
        // Intuition: for each element count frequency
        int left = 0;
        int right = 0;
        while(right < n)
        {
            if(arr[right] !=  arr[left])
            {
                System.out.println("Frequency of " + arr[left] + " is " + (right-left));
                left = right;
            }
            right += 1;

        }
        System.out.println("Frequency of " + arr[left] + " is " + (right-left));
        
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
        getFrequency(arr, n);

    }
}