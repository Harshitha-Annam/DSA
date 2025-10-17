/*

      1       
    2   3
  4       5   
6           7
  8       9
    10   11
      12

*/



import java.util.*;

public class ConditionalPattern4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int half = (n/2)+1;
        int lefthalf = half;
        int righthalf = half;
        int count = 1;
        for(int r = 1; r <= n; r++)
        {
            for(int c = 1; c <= n; c++)
            {
                if(c == lefthalf || c == righthalf)
                {
                    System.out.print(count + " ");
                    count += 1;
                    
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