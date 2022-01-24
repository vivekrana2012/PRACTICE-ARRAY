package org.example.max_sum_sub_array;

public class Index {

    public static void main(String[] args) {

        int[] arr = {2, -4, 10, 1, -20};

        System.out.println("Max Sum - " + maxSum(arr));
    }

    private static int maxSum(int[] arr) {

        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {

            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
