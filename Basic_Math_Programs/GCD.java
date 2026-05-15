import java.lang.*;
import java.util.*;

public class GCD 
{

    // // Logic 1
    // public static void gcd1(int num1 , int num2)
    // {
    //     int gcd_num1 = 1;
    //     for(int i = 1; i <= Math.min(num1, num2); i++)
    //     {
    //         if(num1%i==0 && num2%i==0)
    //         {
    //             gcd_num1 = i;
    //         }
    //     }
    //     System.out.println(gcd_num1+" GCD_1 answer");
    // }

    // // Logic 2

    // public static void gcd2(int num1, int num2)
    // {
    //     for(int i = Math.min(num1, num2); i>=1; i++)
    //     {
    //         if(num1%i==0 && num2%i==0)
    //         {
    //             System.out.println(i+" GCD_2 answer");
    //             break;
    //         }
    //     }
    // }

    public static void gcd3(int num1, int num2)
        {
            while(num1>0 && num2>0)
            {
                if(num1>num2)
                {
                    num1 = num1%num2;
                }
                else
                {
                    num2 = num2%num1;
                }
            }
            if(num1==0)
            {
                System.out.println(num2+" gcd_3");
            }
            if(num2==0)
            {
                System.out.println(num1+" gcd_3");
            }
        }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // gcd1(num1, num2);
        // gcd2(num1, num2);
        gcd3(num1, num2);

    }
}
