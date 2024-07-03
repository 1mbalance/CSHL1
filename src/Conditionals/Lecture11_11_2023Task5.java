package Conditionals;
import java.util.Scanner;

public class Lecture11_11_2023Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 digit number:");
        int num1 = input.nextInt();
        int num2 = num1 / 10000 + num1 / 1000 * 10 + num1 / 100 * 100 + num1 / 10 * 1000;
        System.out.println();
    }
}
