/*

*               * 
* *           * *
* * *       * * * 
* * * *   * * * *
* * * * * * * * *

*/



import java.util.*;

public class StarPattern7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars1 = 1;
        int stars2 = 1;
        int spaces = 2 * n - stars1 - stars2 - 1;
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= stars1; c++)
            {
                System.out.print("* ");
            }
            for(int c = 1; c <= spaces; c++)
            {
                System.out.print("  ");
            }
            for(int c = 1; c <= stars2; c++)
            {
                System.out.print("* ");
            }
            stars1 += 1;
            spaces -= 2;
            if(r != n - 1)
            {
                stars2 += 1;
            }
            System.out.println();
        }
    }
}