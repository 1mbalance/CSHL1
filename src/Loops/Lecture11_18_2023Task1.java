package Loops;
import java.util.Scanner;

public class Lecture11_18_2023Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('*');
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');

            }
            System.out.println();

        }
        System.out.println();

        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');

            }
            System.out.println();

        }
        System.out.println();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print('*');

            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');

            }
            System.out.println();

        }
    }
}
