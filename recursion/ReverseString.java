import java.util.*;
class ReverseString {
    public static String getReverse(String str, int index)
    {
        if(index < 0) return "";
        return str.charAt(index) + getReverse(str, index-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        
        System.out.println(getReverse(str, n-1));
    }
}