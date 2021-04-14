package com.epam.projects.sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int newMin = i + 1; newMin < n; newMin++)
                if (arr[newMin] < arr[min]) {
                    min = newMin;
                }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
