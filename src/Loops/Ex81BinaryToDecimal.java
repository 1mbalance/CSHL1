package Loops;

import java.util.Scanner;

public class Ex81BinaryToDecimal {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a binary number:");
        String binary = kb.nextLine();
        int decimal = 0;
        int place;
        String digit;
        int currentDigit;
        int length = binary.length();
        for (int i = 0; i < length ; i++) {
            place = 1;
            digit = String.valueOf(binary.charAt(length - 1 - i));
            currentDigit = Integer.parseInt(digit);
            for (int j = 0; j < i; j++) {
                place *= 2;
            }

            decimal += place * currentDigit;


        }
        System.out.println("The binary in decimal: " + decimal);
    }
}
