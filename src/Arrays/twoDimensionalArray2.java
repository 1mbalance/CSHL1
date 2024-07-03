package Arrays;

public class twoDimensionalArray2 {


    static int sumPD(int N) {
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int index(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] MAT = {{6, 12, 20, 42, 3, 48},
                {72, 28, 70, 80, 2, 16},
                {60, 72, 10, 56, 9, 54},
                {30, 13, 6, 11, 15, 17}};

        int perfectNum = 0;
        int abundantNum = 0;
        int deficientNum = 0;
        int[] PERFECT;
        int[] ABUNDANT;
        int[] DEFICIENT;
        int num;
        for (int i = 0; i < MAT.length; i++) {
            for (int j = 0; j < MAT[0].length; j++) {
                num = MAT[i][j];
                if (num == sumPD(num)) {
                    perfectNum++;
                } else if (num < sumPD(num)) {
                    abundantNum++;
                } else {
                    deficientNum++;
                }
            }
        }
        PERFECT = new int[perfectNum];
        ABUNDANT = new int[abundantNum];
        DEFICIENT = new int[deficientNum];
        for (int i = 0; i < MAT.length; i++) {
            for (int j = 0; j < MAT[0].length; j++) {
                num = MAT[i][j];
                if (num == sumPD(num)) {
                    PERFECT[index(PERFECT)] = num;
                } else if (num < sumPD(num)) {
                    ABUNDANT[index(ABUNDANT)] = num;
                } else {
                    DEFICIENT[index(DEFICIENT)] = num;
                }
            }
        }

        for (int i = 0; i < PERFECT.length; i++) {

            System.out.print(PERFECT[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ABUNDANT.length; i++) {
            System.out.print(ABUNDANT[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < DEFICIENT.length; i++) {
            System.out.print(DEFICIENT[i] + " ");
        }


    }
}
