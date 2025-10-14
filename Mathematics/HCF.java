import java.util.*;

public class HCF
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // HCF will always be found in the range [1, min(a, b)]
        int num = Math.min(a, b);
        while(num >= 1)
        {
            if(a % num == 0 && b % num == 0)
            {
                break;
            }
            num -= 1;

        }
        System.out.println("HCF is: " + num);
    }
}