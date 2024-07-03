package Conditionals;
import java.util.Scanner;

public class Lecture10_28_23page2Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char alphabet = input.next().charAt(0);
        if (alphabet == 'a') System.out.println("vowel");
        else if (alphabet == 'e') System.out.println("vowel");
        else if (alphabet == 'i') System.out.println("vowel");
        else if (alphabet == 'o') System.out.println("vowel");
        else if (alphabet == 'u') System.out.println("vowel");
        else System.out.println("consonant");
    }
}
