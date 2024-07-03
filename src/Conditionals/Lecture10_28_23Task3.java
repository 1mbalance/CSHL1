package Conditionals;
import java.util.Scanner;

public class Lecture10_28_23Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c values of a quadratic equation:");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double discriminate = Math.pow(b, 2) - 4 * a * c;
        double root1;
        double root2;
        if (discriminate > 0) {
            root1 = ((-b) - Math.sqrt(discriminate)) / (2 * a);
            root2 = ((-b) + Math.sqrt(discriminate)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
        else if (discriminate == 0) {
            root1 = (-b) / (2 * a);
            System.out.println("The only root: " + root1);
        }
        else {
            System.out.println("No roots");
        }

    }
}
