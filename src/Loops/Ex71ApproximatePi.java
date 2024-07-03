package Loops;

public class Ex71ApproximatePi {
    public static void main(String[] args) {
        double pi = 3;
        double term;
        for (int i = 1; i < 100; i++) {
            term = (double) 4 / ((i*2) * (i*2 + 1) * (i*2 + 2));
            System.out.println(term);
            if (i % 2 == 0) {
                term = -term;
            }
            pi += term;
        }
        System.out.println("Pi to 10000 approximations: " + pi);
    }
}
