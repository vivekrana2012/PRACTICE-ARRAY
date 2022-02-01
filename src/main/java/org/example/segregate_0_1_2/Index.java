package org.example.segregate_0_1_2;

import java.util.Arrays;

public class Index {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 2, 0};

        sort012(arr, arr.length);

        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void sort012(int a[], int n) {
        int[] counts = new int[3];

        for (int i = 0; i < n; i++) {
            counts[a[i]] += 1;
        }

        int j = 0;

        for (int i = 0; i < counts.length; i++) {

            while (counts[i] > 0) {
                a[j] = i;
                counts[i]--;
                j++;
            }
        }
    }
}
