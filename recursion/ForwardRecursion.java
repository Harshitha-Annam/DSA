import java.util.*;

class ForwardRecursion
{
    public static int sumOfN(int i, int n , int sum)
    {
        if(i > n) return sum;
        return sumOfN(i+1, n, sum+i);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        int n = sc.nextInt();
        System.out.println(sumOfN(1, 5, 0));


    }
}