package org.example.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Index {

    public static void main(String[] args) {

        Integer[] arr = {2, -4, 10, 1, -20};

        Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
