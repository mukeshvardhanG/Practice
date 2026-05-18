import java.util.*;
import java.lang.*;

public class Recursion_3
{

    // Printing number from N to 1
    
    public static void f1(int n)
    {
        if(n<=0)
        {
            return;
        }
        System.out.println(n);
        f1(n-1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        f1(n);
    }
}