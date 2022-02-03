package org.example.anagram;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountApproach implements Approach {

    @Override
    public boolean isAnagram(String str1, String str2) {

        Map<String, Long> state1 = getState(str1);
        Map<String, Long> state2 = getState(str2);

        return state1.entrySet()
                .stream()
                .filter(entry -> isNotSame(entry, state2))
                .map(entry -> false)
                .findAny()
                .orElse(true);
    }

    private Map<String, Long> getState(String str) {

        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }

    private boolean isNotSame(Map.Entry<String, Long> entry, Map<String, Long> state2) {
        return !entry.getValue()
                .equals(state2.get(entry.getKey()));
    }
}
