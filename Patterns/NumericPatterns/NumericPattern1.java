import java.util.*;

public class NumericPattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n; c++)
            {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}