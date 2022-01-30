package org.example.max_rod_price;

import java.util.HashMap;
import java.util.Map;

public class Index {

    public static void main(String[] args) {

        int[] arr = {3, 9, 13};
        int size = 3;

        Map<Integer, Integer> memo = new HashMap<>(size + 1, 1);

        System.out.println(getMax(arr, size, memo));
    }

    private static int getMax(int[] price, int n, Map<Integer, Integer> memo) {

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n == 0) {
            return 0;
        }

        int max = -1;

        for (int i = 1; i <= n; i++) {

            int value = getMax(price, n - i, memo);

            memo.putIfAbsent(n - i, value);

            value += price[i - 1];

            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}
