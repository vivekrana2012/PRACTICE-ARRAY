package org.example.count_0;

public class Index {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0};

        System.out.println(countZeroes(arr, arr.length));
    }

    static int countZeroes(int[] arr, int n) {

        int zeroIndex = search(arr, 0, n);

        if (zeroIndex == -1) return 0;

        return n - zeroIndex;
    }

    static int search(int[] arr, int start, int end) {

        if (end - start < 2) {

            if (arr[start] == 0) return start;
            else if (arr[end] == 0) return end;
            else return -1;
        }

        int mid = (start + end) >> 1;

        if (arr[mid] > 0) {
            return search(arr, mid + 1, end);
        } else {
            return search(arr, start, mid);
        }
    }
}
