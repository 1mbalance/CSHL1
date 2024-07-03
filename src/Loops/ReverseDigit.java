package Loops;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num, lastDigit, numCopy, numLength = 0, digitPlace = 1;

        num = kb.nextInt();
        numCopy = num;
        while (numCopy > 0) {
            numCopy /= 10;
            numLength++;
        }
        for (int i = 0; i <= numLength; i++) {
            lastDigit = num % 10;
            for (int j = 0; j < numLength - 1 - i; j++) {
                digitPlace *= 10;
            }
            lastDigit *= digitPlace;
            numCopy += lastDigit;
            digitPlace = 1;
            num /= 10;
        }
        System.out.println("The reversed number: " + numCopy);
    }
}
