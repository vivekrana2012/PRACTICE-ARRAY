package org.example.circular_gas_station;

public class Index {

    public static void main(String[] args) {

        int[] gas = {1, 5, 3, 3, 5, 3, 1, 3, 4, 5};
        int[] cost = {5, 2, 2, 8, 2, 4, 2, 5, 1, 2};

        // back tracking solution
        int start = findStation(gas, cost);

        System.out.println("Start :: " + start);
    }

    private static int findStation(int[] gas, int[] cost) {

        for (int i = 0; i < gas.length; i++) {

            int balance = gas[i] - cost[i];

            // if this flow possible great otherwise move to next i
            if (balance > 0 && isNext(gas, cost, i, i + 1, balance)) {
                return i;
            }
        }

        return -1;
    }

    private static boolean isNext(int[] gas, int[] cost, int start, int current, int balance) {

        // rotate at the end
        current %= gas.length;

        // is flow done?
        if (start == current) {
            return true;
        }

        balance += gas[current] - cost[current];

        // check if next can be travelled if yes then flow to next
        return balance >= 0 && isNext(gas, cost, start, current + 1, balance);
    }
}
