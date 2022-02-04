package org.example.first_last_sorted_wip;

public class Index {

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 5, 5, 5, 5, 7, 9, 9};
        int target = 5;

        int firstIndex = firstIndex(arr, target, 0, arr.length);

        System.out.println("firstIndex: " + firstIndex);

//        int lastIndex = lastIndex(arr, target, 0, arr.length);

//        System.out.println("lastIndex: " + lastIndex);
    }

    private static int firstIndex(int[] arr, int target, int left, int right) {

        if (right - left < 2) {

        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return firstIndex(arr, target, mid + 1, right);
        } else {
            return firstIndex(arr, target, left, mid);
        }
    }
}
