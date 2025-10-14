import java.util.*;

public class SieveOfEratosthenes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[n];
        for(int i = 0; i <n;i++)
        {
            arr[i] = true;
        }
        // System.out.println(arr.length);
        arr[0] = false;
        arr[1] = false;
        for(int i = 2; i < n; i++)
        {
            // System.out.println(arr[i]);
                if(arr[i] == true)
                {
                    for(int j = 2*i; j <n; j+=i)
                    {
                        arr[j] = false;
                    }
                }
        }
        for(int i = 0; i < n;i++)
        {
            if(arr[i])
            {
                System.out.print(i + " ");
            }
        }

    }
}