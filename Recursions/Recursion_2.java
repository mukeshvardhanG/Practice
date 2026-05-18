import java.lang.*;
import java.util.*;

public class Recursion_2 
{
    // printing from N times name

    public static void f1(int i, int n)
    {
        if(i > n)
        {
            return ;
        }
        System.out.println("Mukesh Vardhan");
        f1(i+1,n);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        
        f1(1,n);
    }
}
