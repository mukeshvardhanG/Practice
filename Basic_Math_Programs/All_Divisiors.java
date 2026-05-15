import java.lang.*;
import java.util.*;

public class All_Divisiors 
{
    public static void main(String[] args) 
    {
        
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for(int i = 1; i * i <= num; i++)
        {
            if(num % i == 0)
            {
                list.add(i);

                if(num/i != i)
                {
                    list.add(num/i);
                }
            }
        }
        list.sort(null);
        System.out.println(list);
    }
}
