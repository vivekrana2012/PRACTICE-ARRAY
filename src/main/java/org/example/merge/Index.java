package org.example.merge;

import java.util.Arrays;

public class Index {

    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        arr1[0] = 1;
        arr1[1] = 5;
        arr1[2] = 9;
        arr1[3] = 10;
        arr1[4] = 15;
        arr1[5] = 20;

        arr2[0] = 2;
        arr2[1] = 3;
        arr2[2] = 8;
        arr2[3] = 13;

        merge(arr1, arr2);

        Arrays.stream(arr1).filter(i -> i != 0).sorted().forEach(System.out::println);
        Arrays.stream(arr2).filter(i -> i != 0).sorted().forEach(System.out::println);
    }

    private static void merge(int[] arr1, int[] arr2) {

        int i = 0;
        int z = arr1.length - 1;
        int j = 0;

        while (i < z) {
            if (arr1[i] > arr2[j]) {

                int temp = arr1[z];
                arr1[z] = arr2[j];
                arr2[j] = temp;

                z--;
                j++;
            } else {
                i++;
            }
        }
    }
}
