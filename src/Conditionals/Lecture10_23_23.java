package Conditionals;
import java.util.Scanner;

public class Lecture10_23_23 {
    public static void main(String[] args) {
        Scanner bodyProperties = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        double height = bodyProperties.nextDouble();
        System.out.print("Enter weight in kg: ");
        double weight = bodyProperties.nextDouble();
        double bodyMassIndex = weight / (height * height);
        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        }
        else if (bodyMassIndex < 25) {
            System.out.println("Normal weight");
        }
        else if (bodyMassIndex < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
