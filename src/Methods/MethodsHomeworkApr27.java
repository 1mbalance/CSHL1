package Methods;
public class MethodsHomeworkApr27 {
    static int ex85Hypotenuse (int side1, int side2) {
        return (int) Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
    static double ex86TaxiFare(double d) {
        double base = 4;
        d *= 1000;
        return 4 + d / 140 * 0.25;
    }
    static double ex87Shippingcalculator (int n) {
        return 10.95 + 2.95 * (n - 1);
    }
    static int ex88MedianOfThreeValues (int a, int b, int c) {
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            return a;
        }
        else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            return b;
        }
        else {
            return c;
        }
    }
    static double doubleStuff(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println(ex85Hypotenuse(3,4)); // 5
        System.out.println(String.format("%.2f", ex86TaxiFare(2.5))+" $"); // 8.46
        System.out.println(String.format("%.2f", ex87Shippingcalculator(5))+" $"); // 25.70
        System.out.println(ex88MedianOfThreeValues(3,6,7)); // 6
        System.out.println(doubleStuff(30.00,20.00
        ));
    }
}
