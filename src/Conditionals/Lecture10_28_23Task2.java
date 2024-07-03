package Conditionals;
import java.util.Scanner;

public class Lecture10_28_23Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num < 0) {
            num /= -1;
        }
        System.out.println("The absolute value: " + num);
    }
}
