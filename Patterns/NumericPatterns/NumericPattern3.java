/*

1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5

*/

import java.util.*;
public class NumericPattern3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(int r = 1; r <= n; r++)
        {
            int colVal = 1;
            for(int c = 1; c <= n; c++)
            {
                System.out.print(colVal + " ");
                colVal += 1;
            }
            System.out.println();
        }
    }
}