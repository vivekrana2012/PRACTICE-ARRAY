package org.example.cumulative_freq_count;

import java.util.ArrayList;
import java.util.Arrays;

public class Index {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 3, 4};

        countFreq(arr, arr.length).forEach(System.out::println);
    }

    private static ArrayList<Integer> countFreq(int[] a, int n) {
        Arrays.sort(a);

        ArrayList<Integer> list = new ArrayList<>();

        int current = a[0];

        for (int i = 1; i <= n; i++) {

            if (a[i - 1] != current) {
                list.add(i - 1);
                current = a[i - 1];
            }
        }

        list.add(n);

        return list;
    }
}
