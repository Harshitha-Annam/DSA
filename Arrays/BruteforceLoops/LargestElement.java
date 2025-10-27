import java.util.*;

public class LargestElement
{
    public static void getLargestAndSmallestElement(int[] arr, int n)
    {
        int lg = arr[0];
        int sm = arr[0];
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > lg)
            {
                lg = arr[i];
            }
            else if(arr[i] < sm)
            {
                sm = arr[i];
            }
        }
        // return lg;
        System.out.println("Largest Element: " + lg + "\nSmallest Element: " + sm);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input elments into array
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // System.out.println("Largest Element: " + getLargestElement(arr, n));
        getLargestAndSmallestElement(arr, n);
        
    }
}