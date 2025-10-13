/*

111
222
333

*/

import java.util.*;

public class NumericPattern2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowVal = 1;
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n; c++)
            {
                System.out.print(rowVal);
            }
            rowVal+=1;
            System.out.println();
        }
    }
}