package org.example.matrix_interchange;

public class Index {

    public static void main(String[] args) {

        int[][] arr = {{1}};
//        int[][] arr = {{1, 2, 3, 4}, {4, 3, 2, 1}, {6, 7, 8, 9}};

        interchange(arr, 1, 1);
    }

    static void interchange(int a[][], int r, int c) {

        for (int i = 0; i < r; i++) {

            swap(a, i, c);

            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int a[][], int row, int totalCol) {

        int temp = a[row][0];
        a[row][0] = a[row][totalCol - 1];
        a[row][totalCol - 1] = temp;
    }
}
