package Recursion;

public class RecursionTasks {
    public static long factorial(long n) {
        if (n<=1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    public static int bunnyEars(int n) {
        if (n == 0) return 0;
        else if (n==1) return 2;
        else return 2 + bunnyEars(n-1);

    }
    public static int count7(int n) {
        if (n / 10 < 1) {
            if (n == 7) {
                return 1;
            }
            return 0;
        }
        else {
            if (n % 10 == 7) {
                return 1 + count7(n / 10);
            }
            return 0 + count7(n / 10);
        }
    }
    public static int powerN(int b, int n) {
        if (n == 1) {
            return b;
        }
        return b * powerN(b, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(bunnyEars(4)); // 8
        System.out.println(count7(717)); // 2
        System.out.println(powerN(3,4)); // 81

    }
}
