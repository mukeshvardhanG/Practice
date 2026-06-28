package Recursions;

import java.lang.*;
import java.util.*;

public class Recursion_1 {
    // Printing upto 1 to N

    public static void f1(int i, int num) {
        if (i > num) {
            return;
        } else {
            System.out.println(i);
            f1(i + 1, num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        f1(1, num);
    }
}
