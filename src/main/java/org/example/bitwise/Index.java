package org.example.bitwise;

public class Index {

    public static void main(String[] args) {

        int a = 12;
        int num = 7;

        System.out.println("complement of " + num + " = " + ~num);
        System.out.println("2's complement of " + num + " = " + (~num + 1));

        swap(1, 5);
        swap(4, 9);

        System.out.println("IsEven - " + isEven(a));
        System.out.println("IsEven - " + isEven(7));

        System.out.println("Right shift by 2 - " + rightShift(a, 2));
        System.out.println("Left shift by 2 - " + leftShift(a, 2));

        if (rightShift(a, 1) == (a >> 1)) {
            System.out.println("Right Shift works!!");
        }

        if (leftShift(a, 1) == (a << 1)) {
            System.out.println("Left Shift works!!");
        }
    }

    private static void swap(int a, int b) {

        System.out.println("a - " + a + ", b - " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("swapped: a - " + a + ", b - " + b);
    }

    private static boolean isEven(int number) {
        return (number & 1) == 0;
    }

    private static int rightShift(int number, int shifts) {

        for (int i = 0; i < shifts; i++) {
            number /= 2;
        }

        return number;
    }

    private static int leftShift(int number, int shifts) {

        for (int i = 0; i < shifts; i++) {
            number *= 2;
        }

        return number;
    }

}
