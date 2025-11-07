import java.util.*;

public class ContainerWithMostwater
{

    public static int getContainer(int[] arr, int n)
    {
        int max_vol = 0;
        for(int i = 0; i < n-1; i++)
        {
            int vol = 0;
            for(int j =i+1; j < n; j++)
            {
                vol = (j-i)*Math.min(arr[j],arr[i]);
                if(vol > max_vol)
                {
                    max_vol = vol;
                }
            }
        }
        return max_vol;
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
        System.out.println(getContainer(arr, n));
    }
}