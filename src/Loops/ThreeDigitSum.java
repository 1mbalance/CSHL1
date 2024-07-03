package Loops;

import java.util.Scanner;

public class ThreeDigitSum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num, lastDigit, sum = 0;
        num = kb.nextInt();
        while (num > 0 ) {
            lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("The sum of the digits: " + sum);
    }
}
