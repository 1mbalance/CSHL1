package Loops;

import java.util.Scanner;

public class Ex82DecimalToBinary {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a decimal number:");
        int q = kb.nextInt();
        int r;
        String previousNumber;
        String result = "";
        while (q > 0) {
            r = q % 2;
            previousNumber = result;
            result = r + previousNumber;
            q /= 2;
        }
        System.out.println("The binary of the number is " + result);
    }
}
