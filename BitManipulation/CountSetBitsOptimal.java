import java.util.*;

public class CountSetBitsOptimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0)
        {
            n = n & (n-1);
            count += 1;
        }
        System.out.println("Number of set bits: " + count);
    }
}