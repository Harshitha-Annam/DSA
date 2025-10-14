import java.util.*;

public class FactorsOrderedOptimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // O(sqrt(n) + sqrt(n)) => O(sqrt(n))

        for(int i = 1; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        for(int i = (int)Math.sqrt(n); i >= 1; i--)
        {
            if(n % i == 0)
            {
                System.out.print(n/i + " ");
            }
        }
    }
}