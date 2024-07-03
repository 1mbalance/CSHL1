import java.util.Scanner;

public class Lecture09_30_23Task2 {
    public static void main(String[] args) {
        // Scanner class, used for input in Java
        Scanner time = new Scanner(System.in);

        System.out.println("Input the amount of time in minutes:");
        double timeMinutes = time.nextDouble();
        double timeSeconds = timeMinutes * 60 * Math.PI;
        System.out.println("The amount of time in minutes converted to seconds: " + timeSeconds);

    }
}
