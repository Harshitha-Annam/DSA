import java.util.*;
class Factorial
{
    public static int fact(int i, int n , int f)
    {
        if(i > n)
        {
            return f;
        }
        return fact(i+1, n, i*f);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int f = 1;
        int i = 1;
        int n = sc.nextInt();
        System.out.println(fact(i, n, f));
    }
}