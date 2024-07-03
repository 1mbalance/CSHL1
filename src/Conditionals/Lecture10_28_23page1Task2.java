package Conditionals;
import java.util.Scanner;

public class Lecture10_28_23page1Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character:");
        String name = input.nextLine();
        System.out.println("Enter strength (1-10):");
        int strength = input.nextInt();
        System.out.println("Enter health (1-10):");
        int health = input.nextInt();
        System.out.println("Enter luck (1-10):");
        int luck = input.nextInt();
        if (luck+health+strength >= 15) {
            strength = 5;
            health = 5;
            luck = 5;
            System.out.println("You have given your character too many points! Default value have been asigned:");

        }
        System.out.println(name + ", strength: "  + strength + ", health: " + health + ", luck: " + luck);

    }
}
