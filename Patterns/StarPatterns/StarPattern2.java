/*

*
**
***
****

*/




import java.util.*;
public class StarPattern2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1;
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= stars; c++)
            {
                System.out.print('*');
            }
            stars += 1;
            System.out.println();
        }
    }
}