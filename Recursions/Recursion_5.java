import java.lang.*;
import java.util.*;

public class Recursion_5
{
    // Printing from N to 1 using backtracking

    public static void f5(int i, int n)
    {
        if(i > n)
        {
            return ;
        }

        f5(i+1,n);
        System.out.println(i);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        f5(1,n);
    }
}