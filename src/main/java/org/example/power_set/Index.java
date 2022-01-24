package org.example.power_set;

public class Index {

    public static void main(String[] args) {

        String str = "abc";

        powerString(str, 0, "");
    }

    private static void powerString(String str, int i, String currentString) {

        if (i == str.length()) {
            System.out.println(currentString);
            return;
        }

        powerString(str, i + 1, currentString + str.charAt(i));
        powerString(str, i + 1, currentString);

    }
}
