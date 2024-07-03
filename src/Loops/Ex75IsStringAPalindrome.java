package Loops;

import java.util.Scanner;

public class Ex75IsStringAPalindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a string:");
        String palindrome = kb.nextLine();
        int length = palindrome.length();
        String newString = "";
        char currentCharacter;
        for (int i = length - 1; i >= 0; i--) {
            currentCharacter = palindrome.charAt(i);
            newString += currentCharacter;
        }
        if (palindrome.equals(newString)) {
            System.out.println(palindrome + " is a palindrome.");
        }
        else {
            System.out.println(palindrome + " is not a palindrome.");
        }
    }
}
