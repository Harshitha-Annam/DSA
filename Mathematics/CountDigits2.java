import java.util.*;

public class CountDigits2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ten_power = 1;
        int count = 0;
        while(ten_power <= n)
        {
            ten_power *= 10;
            count += 1;

        }
        System.out.println("Number of digits: " + count);
    }
}