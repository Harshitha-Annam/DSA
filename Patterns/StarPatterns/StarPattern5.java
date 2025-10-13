/*

  *
 ***
*****
 ***
  *

*/





import java.util.*;

public class StarPattern5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int half = (n/2) + 1;
        int stars = 1;
        int spaces = half - 1;

        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= spaces; c++)
            {
                System.out.print(" ");
            }
            for(int c = 1; c <= stars; c++)
            {
                System.out.print("*");
            }
            if(r < half)
            {
                spaces -= 1;
                stars += 2;
            }
            else{
                spaces += 1;
                stars -= 2;
            }
            System.out.println();
        }


    }
}