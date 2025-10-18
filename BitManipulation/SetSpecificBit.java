import java.util.*;

public class SetSpecificBit
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        int res = num | (1 << (pos-1));
        System.out.println(res);
    }
}