import java.util.*;

public class GenerateParantheses
{
    public static ArrayList<String> getParantheses(int n, int open, int close, ArrayList<String> list, String s)
    {
        
        if(s.length() == 2 * n)
        {
            list.add(s);
            return list;
        }
        if(open < n)
        {
            getParantheses(n, open+1, close, list, s + "(");
        }
        if(close < open)
        {
            getParantheses(n, open, close+1, list, s + ")");
        }
        return list;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> l = new ArrayList<String>();
        getParantheses(n, 0, 0, l, "");
        for(int i = 0; i < l.size(); i++)
        {
            System.out.println(l.get(i));
        }

    }
}