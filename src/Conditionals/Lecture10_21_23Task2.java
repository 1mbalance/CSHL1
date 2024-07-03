package Conditionals;
import java.util.Scanner;

// Exercise 2 - Town Dump
public class Lecture10_21_23Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the load of trash in pounds: ");
        int weight = input.nextInt();
        int charge = 20;

        if (weight > 200) {
            charge += (weight - 200) / 100 * 8;
        }

        System.out.println("The charge: $" + charge);





    }
}
