package Conditionals;
import java.util.Scanner;

public class Lecture10_14_23Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of purchases in cents:");
        int amount = input.nextInt();
        if (amount > 1000) {
            amount *= 0.9;
            System.out.println("Discounted price: " + amount);
        }
        else {
            System.out.println("The price without discount: " + amount);
        }
        




    }
}
