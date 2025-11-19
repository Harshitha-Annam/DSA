// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int getSumOfDigits(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        return ( num % 10 ) + getSumOfDigits(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of digits : " + getSumOfDigits(num));
    }
}