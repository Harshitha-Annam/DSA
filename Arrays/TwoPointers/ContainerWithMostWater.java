import java.util.*;

public class ContainerWithMostwater
{

    public static int getContainer(int[] arr, int n)
    {
        int max_vol = 0;
        int sp = 0;
        int ep = n-1;
        int vol = 0;
        while(sp < ep)
            {
                vol = (ep-sp)*Math.min(arr[ep],arr[sp]);
                if(vol > max_vol)
                {
                    max_vol = vol;
                }
                if(arr[sp] < arr[ep]) sp+=1;
                else ep -= 1;
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