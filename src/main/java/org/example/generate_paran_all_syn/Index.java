package org.example.generate_paran_all_syn;

import java.util.ArrayList;
import java.util.List;

public class Index {

    public static void main(String[] args) {

        int n = 3;

        List<String> memo = new ArrayList<>();

        generateParan(n, n, "", memo);

        memo.forEach(System.out::println);
        System.out.println("Size :: " + memo.size());
    }

    private static void generateParan(int left, int right, String pattern, List<String> memo) {

        if (left > 0) {
            generateParan(left - 1, right, pattern + "(", memo);
        }

        if (right > left) {
            generateParan(left, right - 1, pattern + ")", memo);
        }

        if (left == 0 && right == 0) {
            memo.add(pattern);
        }

    }
}
