import java.util.*;

public class CountSetBits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0)
        {
            if((n & 1) != 0)
            {
                count += 1;
            }
            n = n >> 1;
        }
        System.out.println("Number of Set bits: " + count);
    }
}