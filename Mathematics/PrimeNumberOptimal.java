import java.util.*;

public class PrimeNumberOptimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n == 2 || n == 3)
        {
            System.out.println("Prime Number");
        }
        else
        {
            if(n % 2 == 0 || n % 3 == 0)
            {
                isPrime = false;
            }
            for(int i = 5; i <= Math.sqrt(n); i += 6)
            {
                if(n % i == 0 || n % (i+1) == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("Prime Number.");
            }
            else{
                System.out.println("Not a Prime Number.");
            }
        }
    }
}