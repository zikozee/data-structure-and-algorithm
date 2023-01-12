package com.zikozee.dsalg.sorting.heapsort;

import com.zikozee.dsalg.sorting.PrintArray;

/**
 * @author: Ezekiel Eromosei
 * @created: 12 January 2023
 */

public class HeapSort {

    int[] arr = null;

    public HeapSort(int[] arr){
        this.arr = arr;
    }
    

    // heap sort uses a binary tree
    public void sort(){
        BinaryHeap bh = new BinaryHeap(arr.length);  //O(1)
        for (int i = 0; i < arr.length; i++) {  //O(N)
            bh.insertInHeap(arr[i]);            //O(LogN)
        }

        for (int i = 0; i < arr.length; i++) {  //O(N)
            arr[i] = bh.extractHeadOfHeap();  // extracting root back to array   //O(N)
        }
        
    }
}
