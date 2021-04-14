package com.epam.projects.sort;

class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {6876, 200, 17, 422322, -67};
        selectionSort (arr);
    }

    public static void selectionSort(int[] arr) {

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
