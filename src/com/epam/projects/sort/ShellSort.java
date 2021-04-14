package com.epam.projects.sort;

public class ShellSort {

    public static void main(String args[]) {

        int arr[] = {12, 34, 54, 2, 3};
        System.out.println ("Array before sorting");
        printArray (arr);

        ShellSort ob = new ShellSort ();
        ob.sort (arr);

        System.out.println ("Array after sorting");
        printArray (arr);
    }

    static void printArray(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print (arr[i] + " ");
        System.out.println ();
    }

    int sort(int arr[]) {

        int n = arr.length;
        for (int count = n / 2; count > 0; count /= 2) {
            for (int i = count; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= count && arr[j - count] > temp; j -= count)
                    arr[j] = arr[j - count];
                arr[j] = temp;
            }
        }
        return 0;
    }
}