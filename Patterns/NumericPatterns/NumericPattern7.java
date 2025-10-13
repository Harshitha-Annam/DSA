/*

        1 
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1

*/

import java.util.*;

public class NumericPattern7 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rowVal = 1;
        int spaces = n-1;
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1;c<=spaces; c++)
            {
                System.out.print("  ");
            }
            spaces -= 1;
            int colVal = rowVal;
            for(int c = 1; c <=n; c++)
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