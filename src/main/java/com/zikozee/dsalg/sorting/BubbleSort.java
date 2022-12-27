package com.zikozee.dsalg.sorting;

/**
 * @author: Ezekiel Eromosei
 * @created: 27 December 2022
 */

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbers = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        algorithm(numbers);
        PrintArray.print(numbers);

    }

    public static void algorithm(int[] arr){
        int n = arr.length;   // 0(1)
        for (int i = 0; i < n - 1; i++) { // 0(N)
            for (int j = 0; j < n - i - 1; j++) { // 0(N)     two for-loops  O(N^2)
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];  // 0(1)
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }



}
