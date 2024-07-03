package Arrays;



public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] MAT = new int[][]{{7,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,-3,0,9,0},
                {0,0,0,0,0,0},
                {0,0,-1,0,0,0},
                {0,-6,0,0,-5,1}};

        int[] VALUES = new int[7];
        int[] ROWC = new int[6];
        int[] COL = new int[7];

        int ptr = 0;
        int n = 0;

        for (int i = 0; i < MAT.length; i++) {
            for (int j = 0; j < MAT[i].length; j++) {
                if (MAT[i][j] != 0) {
                    VALUES[ptr] = MAT[i][j];
                    COL[ptr] = j;
                    n++;
                    ptr++;
                }
            }
            ROWC[i] = n;
                
        }

        for (int i = 0; i < VALUES.length; i++) {

            System.out.print(VALUES[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ROWC.length; i++) {
            System.out.print(ROWC[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < COL.length; i++) {
            System.out.print(COL[i] + " ");
        }

    }
}
