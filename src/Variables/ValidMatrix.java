package Arrays01_13_24;

public class ValidMatrix {

    public static boolean isValidMatrtix(int n, int[][] a) {
        int num;
        int checkPos;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num = a[i][j];
                checkPos = i - j;
                if (checkPos < 0)
                    checkPos /= -1;

                if (checkPos > 1) {
                    if (num != 0)
                        return false;
                }
                else {
                    if (num == 0)
                        return false;
                }

            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[][] MAT = new int[][]{{7,7,0,0,0,0},
                {1,2,1,0,0,0},
                {0,9,-3,5,0,0},
                {0,0,-5,6,4,0},
                {0,0,0,7,7,2},
                {0,0,0,0,5,1}};
        System.out.println(isValidMatrtix(MAT.length, MAT));
    }
}
