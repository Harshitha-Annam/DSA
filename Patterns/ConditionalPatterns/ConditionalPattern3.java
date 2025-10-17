/*

      *       
    *   *
  *       *   
*           *
  *       *
    *   *
      *

*/



import java.util.*;

public class ConditionalPattern3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int half = (n/2)+1;
        int lefthalf = half;
        int righthalf = half;
        
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n; c++)
            {
                if(c == lefthalf || c == righthalf)
                {
                    System.out.print("* ");
                    
                    
                }
                
                else{
                    System.out.print("  ");
                }
                
                    
                
                
            }
            if(r < half)
            {
                lefthalf -= 1;
                righthalf += 1;
            }
            else{
                lefthalf += 1;
                righthalf -= 1;
            }
            
            System.out.println();
        }
        
    }
}