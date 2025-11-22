import java.util.*;
public class PossibleWaysToCutRope
{
    public static int getWays(int n, int a, int b, int c)
    {
        if(n < 0) return 0;
        if(n == 0) return 1;
        return getWays(n - a, a, b, c) + getWays(n - b, a, b, c) + getWays(n - c, a, b, c);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(getWays(n, a, b, c));

    }
}