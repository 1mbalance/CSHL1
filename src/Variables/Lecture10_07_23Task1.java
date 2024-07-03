import java.util.Scanner;

public class Lecture10_07_23Task1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input the password:");
        String userPassword = kb.next();
        String dbPassword = "password123";

        System.out.println("Your password is "+userPassword.equals(dbPassword));
    }
}
