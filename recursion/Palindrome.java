import java.util.*;
public class Palindrome
{
    public static boolean isPalindrome(String str, int lptr, int rptr)
    {
        if(lptr > rptr)
        {
            return true;
        }
        return ( str.charAt(lptr) == str.charAt(rptr) ) && isPalindrome(str, ++lptr, --rptr);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int lptr = 0;
        int rptr = str.length() - 1;
        System.out.println(isPalindrome(str, lptr, rptr));

    }
}