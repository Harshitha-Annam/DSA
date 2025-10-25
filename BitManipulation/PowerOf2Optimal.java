import java.util.*;

public class PowerOf2Optimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & (n-1)) == 0)
        {
            System.out.println("Yes! " + n + " is a power of 2!");
        }
        else
        {
            System.out.println("No! " + n + " is not a power of 2!");
        }
    }
}