package org.example.anagram;

public class Index {

    public static void main(String[] args) {

        String str1 = "danger";
        String str2 = "garden";

        Approach approach = new SortApproach();

        System.out.println("isAnagram :: " + approach.isAnagram(str1, str2));
    }
}
