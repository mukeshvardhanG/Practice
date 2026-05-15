import java.util.*;
import java.lang.*;

public class Prime_Number 
{

    public static boolean isPrime(int num)
    {
        

        if(num < 2)
        {
            System.out.println(num+" is not prime");
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num%i == 0)
            {
                System.out.println(num+" is not a prime");
                return false;
            }
        }

        System.out.println(num+" is a prime number");
        
        return true;


    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        isPrime(num);
    
    }
}
