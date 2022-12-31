package com.zikozee.dsalg.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: Ezekiel Eromosei
 * @created: 29 December 2022
 */

public class BucketSort {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        algorithm(numbers);
        System.out.println("****************");
        PrintArray.print(numbers);
    }

    public static void algorithm(int[] arr){
        int numberOfBuckets = (int)Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for(int value : arr){
           if(value > maxValue){
               maxValue = value;
           }
        }

        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(int value : arr){
            int bucketNumber = (int) Math.ceil((float)value * numberOfBuckets/(float) maxValue);
            buckets[bucketNumber -1].add(value);
        }

        System.out.println("\n\nPrinting buckets before sorting...");
        printBucket(buckets);

        for(ArrayList<Integer> bucket: buckets){
            Collections.sort(bucket);
        }

        System.out.println("\n\nPrinting buckets after sorting...");
        printBucket(buckets);

        int index = 0;
        for(ArrayList<Integer> bucket: buckets){
            for (int value: bucket){
                arr[index] = value;
                index++;
            }

        }
    }

    public static void printBucket(List<Integer>[] buckets){
        for (int i = 0; i <buckets.length; i++) {
            System.out.println("\nBucket#" + i + ":");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.println(buckets[i].get(j) + " ");
            }
        }
    }
}
