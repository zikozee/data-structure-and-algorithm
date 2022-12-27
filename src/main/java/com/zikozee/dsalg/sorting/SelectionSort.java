package com.zikozee.dsalg.sorting;

/**
 * @author: Ezekiel Eromosei
 * @created: 27 December 2022
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        algorithm(numbers);
        PrintArray.print(numbers);
    }
    
    public static void algorithm(int[] arr){
        for (int i = 0; i < arr.length; i++) { // 0(N)
            int minimumIndex  = i;  // 0(1)
            for (int j = i + 1; j < arr.length; j++) { // 0(N)
                if(arr[j] < arr[minimumIndex]){   // 0(1)
                    minimumIndex = j;    // 0(1)
                }
            }
            if(minimumIndex != i) {   // 0(1)
                int temp = arr[i];  // 0(1)
                arr[i] = arr[minimumIndex];  // 0(1)
                arr[minimumIndex] = temp;  // 0(1)
            }
        }
    }
}
