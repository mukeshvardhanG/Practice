import java.util.*;
import java.lang.*;

public class Prime_Number 
{

    public static boolean isPrime(int num)
    {
        
        int count = 0;

        if(num < 2)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num%i == 0)
            {
                System.out.println(num+" is not a prime")
                return false;
            }
        }

        if(count == 2)
        {
            System.out.print(num+" is a prime number");
            return true;
        }
        else
        {
            System.out.print(num+" is not a prime number ");
            return false;
        }


    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        isPrime(num);
    
    }
}
