import java.util.*;

public class PowerSets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int max = (int)Math.pow(2, arr.length);

        for(int i = 0; i < max; i++)
        {
            StringBuilder s = new StringBuilder("");
            int bm = 1;
            int idx = arr.length - 1;
            while(idx > -1 )
            {
                if((bm & i) != 0)
                {
                    s.append(arr[idx]);
                }
                bm = bm << 1;
                idx--;
            }
            System.out.println(s);
        }
    }
}