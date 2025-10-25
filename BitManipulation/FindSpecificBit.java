import java.util.*;

public class FindSpecificBit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        // int res = (num & (1 << (pos - 1)))>>(pos - 1);
        // if(res == 1)
        if((num & (1 << (pos-1))) != 0)
        {
            System.out.println("Bit is set.");
        }
        else
        {
            System.out.println("Bit is Unset.");
        }
    }
}