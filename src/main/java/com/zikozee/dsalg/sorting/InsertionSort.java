package com.zikozee.dsalg.sorting;

/**
 * @author: Ezekiel Eromosei
 * @created: 28 December 2022
 */

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        algorithm(numbers);
        PrintArray.print(numbers);
    }

    public static void algorithm(int[] arr){
        for (int i = 1; i < arr.length; i++) { // 0(N)
            int temp = arr[i];  // 0(1)
            int j = i;  // 0(1)
            while (j > 0 && arr[j-1] > temp){ // 0(N)
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
