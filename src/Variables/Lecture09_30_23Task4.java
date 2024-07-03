import java.util.Scanner;

public class Lecture09_30_23Task4 {
    public static void main(String[] args) {
        Scanner personProperties = new Scanner(System.in);

        System.out.println("Input the height of a person (in meters):");
        double height = personProperties.nextDouble();
        System.out.println("Input the weight of the same person (in kilograms):");
        double weight = personProperties.nextDouble();
        double bodyMassIndex = weight / (height * height);
        System.out.println("Your BMI: " + bodyMassIndex);
    }
}
