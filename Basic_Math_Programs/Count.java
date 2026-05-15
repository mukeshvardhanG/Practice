import java.lang.*;
import java.util.*;

public class Count 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num;

        int count = 0;

        int value = (int)(Math.log10(temp)) + 1;
    
        System.out.println("This is the count : "+value);

        while(num>0)
        {
            int rem = num%10;
            count = count + 1;
            num = num / 10;
        }

        System.out.println(count);

    }
}
