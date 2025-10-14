import java.util.*;

public class CountDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0)
        {
            int lastDig = n % 10;
            count += 1;
            n = n/10;

        }
        System.out.println("Number of digits: " + count);
    }
}