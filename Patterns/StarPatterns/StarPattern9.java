/*

*           * 
* *       * *
* * *   * * *
* * * * * * *
* * *   * * *
* *       * * 
*           *

*/



import java.util.*;

public class StarPattern9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int stars1 = 1;
        int stars2 = 1;
        int half = (n/2)+1;
        int spaces = 2*half - stars1 - stars2 - 1;
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
            if(r < half)
            {
                spaces-= 2;
                stars1 += 1;
                if(r < half - 1)
                {
                    stars2 += 1;
                }

            }
            else
            {
                spaces += 2;
                stars1 -= 1;
                if(r > half)
                {
                    stars2 -= 1;
                }
            }
            System.out.println();
        }
    }
}