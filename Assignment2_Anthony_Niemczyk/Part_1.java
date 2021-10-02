import java.util.*;

class Part_1 {
    public static void main(String[] args) {
        final int rows = 4;
        final int columns = 4;
        int i = 0;
        int j = 0;

        int[][] array_2d = new int[columns][rows];
        for (i = 0; i < array_2d.length; i++) {
            for (j = 0; j < array_2d[i].length; j++) {
                array_2d[i][j] = (i + j);
            }
            System.out.println(Arrays.toString(array_2d[i]));
            System.out.println();
        }
        int row = array_2d[0].length;
        int col = array_2d[0].length;
        int sumRow = 0;
        for (j = 0; j < col; j++) {
            sumRow = sumRow + array_2d[1][j];
        }
        System.out.println("Sum of 2nd row: " + sumRow);

        int sumCol = 0;
        for (i = 0; i < row; i++) {
            sumCol = sumCol + array_2d[i][2];
        }
        System.out.println("Sum of 3rd column: " + sumCol);


        int sumElements = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sumElements = sumElements + array_2d[i][j];
            }
        }
            System.out.println("Sum of all elements: " + sumElements);
    }
}

