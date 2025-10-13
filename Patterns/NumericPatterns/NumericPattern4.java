/*

1
12
123
1234

*/


import java.util.*;

public class NumericPattern4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int rowVal = 1;
        for(int r = 1; r <= n; r++)
        {
            int colVal = 1;
            for(int c = 1; c <= n; c++)
            {
                if(colVal <= r)
                {
                    System.out.print(colVal);

                }
                colVal += 1;
            }
            System.out.println();
        }
    }
}