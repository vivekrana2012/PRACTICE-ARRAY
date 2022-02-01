package org.example.multiple_3;

public class Index {

    public static void main(String[] args) {

        int n = 3;
        int[] arr = {40, 50, 90};

        System.out.println(isPossible(n, arr));
    }

    static int isPossible(int N, int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += sum(arr[i]);
        }

        return sum % 3 == 0 ? 1 : 0;
    }

    static int sum(int num) {

        if (num < 10) {
            return num;
        }

        return sum(num / 10) + (num % 10);
    }
}
