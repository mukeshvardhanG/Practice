import java.lang.*;
import java.util.Scanner;

public class Recursion_6_1
{

    public static int sum(int i)
    {
        if(i < 0)
        {
            return 0;
        }

        return i + sum(i - 1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = sc.nextInt();

        System.out.println(sum(i));
    }
}