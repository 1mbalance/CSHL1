package Loops;

import java.util.Scanner;

public class Ex79GreatestCommonDifference {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int n = kb.nextInt();
        int m = kb.nextInt();
        int d;
        if (n > m) d = m;
        else d = n;

        while (m % d > 0 || n % d > 0) {
            d--;
        }
        System.out.println(d + " is the greatest common divisor of " + m + " and " + n + '.');
    }
}
