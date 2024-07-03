package Conditionals;
import java.util.Scanner;

// Exercise 1 - Internet Delicatessen
public class Lecture10_21_23Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item: ");
        String item = input.nextLine();

        System.out.print("Enter the price: ");
        double price = input.nextDouble();

        System.out.print("Overnight delivery (0==no, 1==yes): ");
        byte express = input.nextByte();

        double delivery = 0;
        if (price < 10) {
            delivery += 2;
        }
        if (express == 1) {
            delivery += 3;
        }
        double total = delivery + price;
        System.out.println();
        System.out.println("Invoice:");
        System.out.println(item + "  " + price);
        System.out.println("delivery  " + delivery);
        System.out.println("total  " + total);





    }
}
