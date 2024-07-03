package Conditionals;
import java.util.Scanner;

public class Lecture10_14_23Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is even.");
        }
        else {
            System.out.println("It is odd.");
        }



    }
}
