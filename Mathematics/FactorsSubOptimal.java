import java.util.*;

public class FactorsSubOptimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // O(n/2) - suboptimal solution
        System.out.print(n + " ");
        for(int i = n/2; i >= 1; i--)
        {
            if(n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}