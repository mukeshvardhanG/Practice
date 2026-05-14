import java.lang.*;
import java.util.*;

/*

    *    
   ***   
  *****  
 ******* 
*********

*/
public class Pattern_7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of lines");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i+1); j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j < n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
