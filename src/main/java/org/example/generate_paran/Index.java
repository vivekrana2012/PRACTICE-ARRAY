package org.example.generate_paran;

public class Index {

    public static void main(String[] args) {

        int n = 5;

        generateParan(n);
    }

    private static void generateParan(int n) {

        if (n == 0) {
            return;
        }

        System.out.print("(");

        generateParan(n - 1);

        System.out.print(")");
    }
}
