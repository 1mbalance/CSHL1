package Conditionals;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a five-digit number:");
        int num = kb.nextInt();
        int reversedNum = 10000 * (num % 10) + 1000 * (num / 10 % 10) + 100 * (num / 100 % 10) + 10 * (num / 1000 % 10) + num / 10000;
        System.out.println(reversedNum);
        if (num == reversedNum) {
            System.out.println("The original and reversed are equal.");
        }
        else {
            System.out.println("The original and reversed are not equal.");
        }
    }
}
