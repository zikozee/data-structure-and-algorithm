package com.zikozee.dsalg.datastructure.stack;

/**
 * @author: Ezekiel Eromosei
 * @created: 16 January 2023
 */

public class Stack {

    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        boolean result = newStack.isEmpty();
        System.out.println(result);
        boolean isFull = newStack.isFull();
        System.out.println(isFull);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);

        int firstPop = newStack.pop();
        System.out.println(firstPop);
        int secondPop = newStack.pop();
        System.out.println(secondPop);

        int peek = newStack.peek();
        System.out.println(peek);
        int peek2 = newStack.peek();
        System.out.println(peek2);

        newStack.delete();
    }

    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: " + size);
    }

    public boolean isEmpty(){
        return topOfStack == -1;
    }

    public boolean isFull(){
        return topOfStack == arr.length -1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }else {
            arr[topOfStack +1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[topOfStack];
        }
    }

    public void delete(){
        arr = null;
        System.out.println("Stack is successfully deleted");
    }
}
