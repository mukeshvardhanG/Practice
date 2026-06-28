import java.lang.*;
import java.util.*;

public class Recursion_6
{


    public static void sum(int i, int summing)
    {

        if(i < 1)
        {
            System.out.println(summing);
            return ;
        }

        sum(i-1, summing + i);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        sum(num,0);
    }
}