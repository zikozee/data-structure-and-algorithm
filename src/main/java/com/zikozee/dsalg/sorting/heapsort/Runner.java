package com.zikozee.dsalg.sorting.heapsort;

import com.zikozee.dsalg.sorting.PrintArray;

/**
 * @author: Ezekiel Eromosei
 * @created: 12 January 2023
 */

public class Runner {

    public static void main(String[] args) {
        int[] arr= {2, 7, 3, 1, 4, 8, 9};
        HeapSort hs = new HeapSort(arr);
        hs.sort();

        PrintArray.print(arr);
    }
}
