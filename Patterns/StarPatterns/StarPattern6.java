/*

*                 * 
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *

*/



import java.util.*;

public class StarPattern6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars1 = 1;
        int stars2 = 1;
        int spaces = n * 2 - stars1 - stars2;

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
            stars2 += 1;
            spaces -= 2;
            System.out.println();
        }
    }
}