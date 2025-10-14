import java.util.*;

public class FactorsOptimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // O(sqrt(n)) - optimal solution - No Order
        for(int i = 1; i <= Math.sqrt(n); i++)
        {
            if(n % i ==0)
            {
                System.out.print(i + " ");
                System.out.print(n/i + " ");
            }
        }
    }
}