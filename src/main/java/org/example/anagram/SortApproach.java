package org.example.anagram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortApproach implements Approach {

    @Override
    public boolean isAnagram(String str1, String str2) {

        String str1Sorted = sortedString(str1);
        String str2Sorted = sortedString(str2);

        return str1Sorted.equals(str2Sorted);
    }

    private String sortedString(String str) {

        return Arrays.stream(str.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
