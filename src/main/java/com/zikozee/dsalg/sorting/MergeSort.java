package com.zikozee.dsalg.sorting;

/**
 * @author: Ezekiel Eromosei
 * @created: 02 January 2023
 */

public class MergeSort {
    public static void main(String[] args) {

        int[] numbers = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        algorithm(numbers, 0, numbers.length -1);
        PrintArray.print(numbers);

    }

    public static void algorithm(int[] arr, int left, int right){
        if (right > left){
            int middle = (left + right)/2;
            algorithm(arr, left, middle);
            algorithm(arr, middle + 1, right);
            helperSort(arr, left, middle, right);
        }
    }

    public static void helperSort(int[] arr, int left, int middle, int right){
        int[] leftTempArr = new int[middle-left + 2];   // + 2 to avoid out of bound exception
        int[] rightTempArr = new int[right - middle + 1];  // + 1 to avoid out of bound exception

        for (int i = 0; i <=middle - left; i++) {
            leftTempArr[i] = arr[left + i];
        }
        for (int i = 0; i <right - middle; i++) {
            rightTempArr[i] = arr[middle + 1 + i];
        }

        leftTempArr[middle - left + 1] = Integer.MAX_VALUE;
        rightTempArr[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTempArr[i] < rightTempArr[j]){
                arr[k] = leftTempArr[i];
                i++;
            }else {
                arr[k] = rightTempArr[j];
                j++;
            }
        }
    }
}
