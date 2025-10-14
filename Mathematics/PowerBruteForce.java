import java.util.*;

public class PowerBruteForce
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int powVal = 1;
        for(int i = 1; i <= n; i++)
        {
            powVal *= a;
        }
        System.out.println("a power n is : " + powVal);

    }
}