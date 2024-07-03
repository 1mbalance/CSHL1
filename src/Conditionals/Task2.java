package Conditionals;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of days the member is late:");
        int days = kb.nextInt();

        if (days > 30) {
            System.out.println("Your membership will be cancelled.");
        }
        else if (days > 10) {
            System.out.println("The fine is 250 pln.");
        }
        else if (days > 5) {
            System.out.println("The fine is 100 pln.");
        }
        else {
            System.out.println("The fine is 50 pln.");
        }
    }
}
