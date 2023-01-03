package com.zikozee.dsalg.sorting;

/**
 * @author: Ezekiel Eromosei
 * @created: 03 January 2023
 */

public class QuickSort {

    public static void main(String[] args) {

        int[] numbers = {5, 9, 3, 1, 2, 2, 8, 4, 7, 6};
        algorithm(numbers, 0, numbers.length -1);
        PrintArray.print(numbers);

    }

    public static void algorithm(int[] arr, int start, int end){  // T(N)     ---->>> O(NlogN) (by substitution)
        if(start < end) {
            int pivot = partition(arr, start, end); // O(N)
            algorithm(arr, start, pivot -1);  // T(N/2)
            algorithm(arr, pivot + 1, end); // T(N/2)
        }
    }

    public static int partition(int[] arr, int start, int end){   // O(N)
        int pivot = end;   //O(1)
        int i = start - 1;  //O(1)    // we are taking account of zero
        for (int j = start; j <= end; j++) {   //O(N)
            if(arr[j] <= arr[pivot]){  //O(1)
                i++; //O(1)
                int temp = arr[i]; //O(1)
                arr[i] = arr[j]; //O(1)
                arr[j] = temp; //O(1)
            }
        }
        return  i;  //O(1)
    }
}
