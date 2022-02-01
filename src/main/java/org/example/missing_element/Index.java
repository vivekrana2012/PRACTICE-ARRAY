package org.example.missing_element;

import java.util.Arrays;

public class Index {

    public static void main(String[] args) {

        int n = 10;
        int[] arr = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println(missingNumber(arr, n));
    }

    private static int missingNumber(int[] array, int n) {

        int sum = (n * (n + 1)) / 2;

        sum -= Arrays.stream(array).sum();

        return sum;
    }
}
