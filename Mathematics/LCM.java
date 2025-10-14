import java.util.*;

public class LCM 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // brute force - loop through all elements from max(a,b) to a*b
        // int num = Math.max(a, b);
        // while(true)
        // {
        //     if(num % a == 0  && num % b == 0)
        //     {
        //         break;
        //     }
        //     num += 1;

        // }
        // System.out.println("LCM is :" + num);

        //Optimization tip - lcm is always found in the range of max(a, b) - a*b and is always found in the 
        // multiples of max(a,b)

        int num = Math.max(a, b);
        int i = num;
        for(; i <= a * b; i+=num)
        {
            if(i % a == 0 && i % b == 0)
            {
                break;
            }
            
        }
        System.out.println("LCM is: " + i);

    }
}