import java.util.*;

public class FactorsBruteForce
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // O(n) - solution

        for(int i = n; i >= 1; i--)
        {
            if(n % i ==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}