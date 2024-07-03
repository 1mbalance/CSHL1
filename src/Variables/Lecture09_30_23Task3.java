import java.util.Scanner;

public class Lecture09_30_23Task3 {
    public static void main(String[] args) {
        Scanner triangleProperties = new Scanner(System.in);

        System.out.println("Input the height of a triangle:");
        double height = triangleProperties.nextDouble();
        System.out.println("Input the base of the same triangle:");
        double base = triangleProperties.nextDouble();
        double triangleArea = base * height / 2;
        System.out.println("The area of the triangle: " + triangleArea);
    }
}
