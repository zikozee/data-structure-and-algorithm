package com.zikozee.dsalg.sorting;

/**
 * @author: Ezekiel Eromosei
 * @created: 27 December 2022
 */

public final class PrintArray {

    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
