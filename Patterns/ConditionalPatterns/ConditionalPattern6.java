/*

*     * * * * 
*     *
*     *
* * * * * * *
      *     *
      *     *
* * * *     *

*/



import java.util.*;

public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int half = (n/2)+1;
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n; c++)
            {
                if(r == half)

                {
                    System.out.print('_');
                    // System.out.println("row  " + r + "col  " + c);
                }
                else{
                    System.out.print(" ");
                }
                if(c == half)
                {
                    System.out.print('|');
                    // System.out.println("row  " + r + "col  " + c);
                }

                else{
                    System.out.print(" ");
                }
                if((r == 1 && c > half) || (r ==n && c < half))
                {
                    System.out.print('_');
                    // System.out.println("row  " + r + "col  " + c);
                }
                else{
                    System.out.print(" ");
                }
                if((c == 1 && r < half) || (c == n && r > half))
                {
                    System.out.print('|');
                    // System.out.println("row  " + r + "col  " + c);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}