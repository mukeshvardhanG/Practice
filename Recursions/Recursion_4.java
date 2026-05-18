import java.lang.*;
import java.util.*;

public class Recursion_4
{

    // Printing from 1 to N using backtracking
    
    public static void f4(int i, int n)
    {
        if(i<=0)
        {
            return;
        }
        f4(i-1,n);
        System.out.println(i);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        f4(n, n);
    }
}