package com.zikozee.dsalg.datastructure.stack;

import com.zikozee.dsalg.datastructure.linkedlist.LinkedList;

/**
 * @author: Ezekiel Eromosei
 * @created: 17 January 2023
 */

public class LinkedListStack {

    public static void main(String[] args) {
        LinkedListStack newStack = new LinkedListStack();
        boolean result = newStack.isEmpty();
        System.out.println(result);

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        boolean result1 = newStack.isEmpty();
        System.out.println(result1);

        int pop= newStack.pop();
        System.out.println("popped: " + pop);
        int peek= newStack.peek();
        System.out.println("peek: " + peek);

        newStack.delete();
    }

    LinkedList linkedList;

    public LinkedListStack(){
        linkedList = new LinkedList();
    }

    public void push(int value){
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted value " + value + " in stack");
    }

    public boolean isEmpty(){
        return linkedList.head == null;
    }

    public int pop(){
        int result = -1;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else {
            return linkedList.head.value;
        }
    }

    public void delete(){
        linkedList.head = null;
        System.out.println("The stack is deleted");
    }
}
