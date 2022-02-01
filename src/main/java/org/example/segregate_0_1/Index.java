package org.example.segregate_0_1;

import java.util.Arrays;

public class Index {

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 0};

        segregate0and1(arr, arr.length);

        Arrays.stream(arr).forEach(System.out::println);
    }

    static void segregate0and1(int[] arr, int n) {

        int left = 0;
        int right = n - 1;

        while (left < right) {

            if (arr[right] == 0) {

                if (arr[left] == 1) {

                    arr[left] += arr[right];
                    arr[right] = arr[left] - arr[right];
                    arr[left] -= arr[right];

                    right--;
                    left++;

                } else {
                    left++;
                }

            } else {
                right--;
            }

        }

    }
}
