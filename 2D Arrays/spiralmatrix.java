public class spiralmatrix {
    public static void printSpiral(int[][] matrix) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // Print top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            startrow++;

            // Print right column
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            endcol--;

            // Print bottom row
            if (startrow <= endrow) {
                for (int j = endcol; j >= startcol; j--) {
                    System.out.print(matrix[endrow][j] + " ");
                }
                endrow--;
            }

            // Print left column
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    System.out.print(matrix[i][startcol] + " ");
                }
                startcol++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(matrix);
    }
}
