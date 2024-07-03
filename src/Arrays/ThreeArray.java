package Arrays;

public class ThreeArray {
    static int[] three = new int[2];
    static int index(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void threeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] / 100 < 10 && a[i] / 100 > 0) {
                int num1 = a[i] / 100;
                int num2 = a[i] % 100 / 10;
                int num3 = a[i] % 10;
                if (num1 < num2 && num2 < num3) {
                    three[index(three)] = a[i];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9,3456,12,237,45679,368,296};
        threeArray(array);
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i] + " ");
        }
    }
}
