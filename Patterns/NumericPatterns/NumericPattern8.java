/*

1                 1 
1 2             2 1 
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

*/

import java.util.*;

public class NumericPattern8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowVal = 1;
        int spaces = 2 * n - rowVal - rowVal;
        for(int r = 1; r <= n; r++)
        {
            int colVal = 1;
            for(int c = 1; c <= n; c++)
            {
                if(colVal <= rowVal)
                {
                    System.out.print(colVal + " ");
                }
                colVal += 1;
            }
            for(int c =1; c <= spaces; c++)
            {
                System.out.print("  ");
            }
            spaces -= 2;
            colVal = rowVal;
            for(int c = 1; c <= n; c++)
            {
                if(colVal >= 1)
                {
                    System.out.print(colVal + " ");
                }
                colVal -= 1;
            }
            rowVal += 1;
            System.out.println();
        }
    }
}