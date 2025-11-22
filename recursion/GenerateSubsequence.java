import java.util.*;

public class GenerateSubsequence
{
    public static void getSubsequence(String s, String ans)
    {
        // System.out.println(s.charAt(0));
        if(s.length()==0)  // not s == ""
        {
            System.out.println(ans);
            return;

        }
        char c = s.charAt(0);
        getSubsequence(s.substring(1), ans + c);
        getSubsequence(s.substring(1), ans);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // SrtingBuilder sb = new SrtingBuilder(s);
        getSubsequence(s, "");

    }
}