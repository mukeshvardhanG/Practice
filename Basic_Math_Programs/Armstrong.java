import java.lang.*;
import java.util.*;

public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;

        int digit = (int)(Math.log10(num)) + 1;

        int sum = 0;

        while(num > 0)
        {
            int rem = num % 10;
            sum = (int) (sum + Math.pow(rem,digit));
            num = num / 10;
        }

        if(temp == sum)
        {
            System.out.println("This is armstrong number");
        }
        else
        {
            System.out.println("This is not armstrong number");
        }
    }
}
