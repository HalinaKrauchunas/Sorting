//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один
// массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.

package com.epam.projects.sort;

import com.epam.projects.*;

import java.util.*;

public class TwoInOne {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader (System.in);
        int k = ParseNumber.getPositiveInt (reader);
        int[] a = {1, 2, 4, 5};
        int[] b = {6, 7, 8};
        ArrayList<Integer> c = new ArrayList<> ();

        for (int i = 0; i < a.length; i++) {
            if (i < k) {
                c.add (a[i]);
            }
        }
        for (int j : b) {
            c.add (j);
        }
        for (int count = 0; count < a.length; count++) {
            if (count >= k) {
                c.add (a[count]);
            }
        }
        System.out.println (c);
    }
}
