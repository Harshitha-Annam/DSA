import java.util.*;

public class RemoveDuplicates
{
    public static void removeDuplicates(int[] arr, int n)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[0]);
        for(int i = 1; i < n; i++)
        {
            if(arr[i] != al.get(al.size() - 1))
            {
                al.add(arr[i]);
            }
        }

        for(int i = 0; i < al.size(); i++)
        {
            System.out.print(al.get(i) + " ");
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
        removeDuplicates(arr, n);

    }
}