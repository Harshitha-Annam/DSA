import java.util.*;

public class SecondLargest {

    public static void getSecondLargest(int[] arr, int n)
    {
        int lg = -1;
        int slg = -1;
        for(int i = 0; i < n; i++)
        {
            System.out.println("lg " + lg + " slg " + slg);
            if(arr[i] > lg)
            {
                slg = lg;
                lg = arr[i];
            
            }
            else if(arr[i] > slg && arr[i] < lg)
            {
                slg = arr[i];
            }
        }

        System.out.println("Second Largest Element : " + slg);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // input elements into an array
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();

        }

        getSecondLargest(arr, n);
    }
}