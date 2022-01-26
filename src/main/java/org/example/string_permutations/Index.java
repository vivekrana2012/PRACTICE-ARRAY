package org.example.string_permutations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Index {

    public static void main(String[] args) {

        String str = "abcd";

        Set<String> state = new HashSet<>();


    }

    private static void add(String[] str, int fixed, Set<String> state) {

        String[] fixedArray = swap(str, fixed);



    }

    private static void permute(String[] str, int i, Set<String> state) {

        if (i == str.length) {
            state.add(Arrays.toString(str));
            return;
        }

        permute(str, i + 1, state);
    }

    private static String[] swap(String[] str, int i) {

        String temp = str[i];
        str[i] = str[0];
        str[0] = temp;

        return str;
    }
}
