package com.zikozee.dsalg.sorting.heapsort;

/**
 * @author: Ezekiel Eromosei
 * @created: 12 January 2023
 */

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size) {
        // adding 1 here so that first cell of the array can be left blank all the time. This eliminate
        // problem of array starting from index 0
        arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Empty Heap has been created !");
    }


    public int sizeOfArray(){
        return arr.length;
    }

    public int sizeOfTree(){
        System.out.println("Size of Tree: " + sizeOfTree);
        return sizeOfTree;
    }

    public boolean isHeapEmpty(){
        if(sizeOfTree <= 0){
            System.out.println("Tree is empty");
            return true;
        }else {
            System.out.println("Tree is not Empty");
            return false;
        }
    }

    public void levelOrder() {
        for (int i =1; i<=sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    // Heapify for Insert
    public void heapifyBottomToTop(int index) {
        int parent = index / 2;
        if (index <= 1 ) {
            return;
        }
//        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int tmp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
//        } else if (heapType == "Max") {
//            if (arr[index] > arr[parent]) {
//                int tmp = arr[index];
//                arr[index] = arr[parent];
//                arr[parent] = tmp;
//            }
//        }
        heapifyBottomToTop(parent);

    }

    // heapifyTopToBottom
    public void heapifyTopToBottom(int index) {
        int left = index*2;
        int right = index*2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
//        if (heapType.equalsIgnoreCase("Max")) {
//            if (sizeOfTree == left) {
//                if (arr[index] < arr[left]) {
//                    int tmp = arr[index];
//                    arr[index] = arr[left];
//                    arr[left] = tmp;
//                }
//                return;
//            } else {
//                if (arr[left]>arr[right]) {
//                    swapChild = left;
//                } else {
//                    swapChild = right;
//                }
//                if (arr[index] < arr[swapChild]) {
//                    int tmp = arr[index];
//                    arr[index] = arr[swapChild];
//                    arr[swapChild] = tmp;
//                }
//            }
//        } else if (heapType.equalsIgnoreCase("Min")) {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
        }
        heapifyTopToBottom(swapChild);
    }


    public void deleteHeap(){
        arr = null;
        System.out.println("Heap has been deleted !");
    }

    public void insertInHeap(int value){
        //Doing +1 because sizeOfTree always points to the last occupied cell of the array
        System.out.println("Inserting " + value + " in Heap");
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree);
        System.out.println("Inserted " + value + " successfully in Heap !");
        levelOrder();
    }


    public void peek(){
        if(sizeOfTree == 0){
            System.out.println("Heap is empty");
        }else {
            System.out.println("Head of Heap is " + arr[1]);
        }
    }

    public int extractHeadOfHeap() {
        if(sizeOfTree == 0) {
            System.out.println("Heap is empty !");
            return  -1;
        }else {
            System.out.println("Head of the Heap is: " + arr[1]);
            System.out.println("Extracting it now");
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1);
            System.out.println("Sucessfully extracted value from Heap.");
            levelOrder();
            return extractedValue;
        }
    }
}
