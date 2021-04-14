package com.epam.projects.sort;

public class InsertSort {

    void sort(int[] arr) {

        int len = arr.length;
        for (int i = 1; i < len; ++i) {
            int count = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > count) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = count;
        }
    }
}
