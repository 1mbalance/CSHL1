package Conditionals;
import java.util.Scanner;

public class Lecture10_14_23Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("It is positive");
        }
        else {
            System.out.println("It is negative");
        }



    }
}
