package com.DatastructuresAndAlgorithms.stacks;

//                                  STACKS - ARRAY IMPLEMENTATION
public class Main {

//    Instead of dictating how we store the items, stacks dictate what operations we can perform on the items.
//    Stack is an Abstract Data type.
//    LIFO - Last In First Out.

//    push - Adds item on top of stack
//    pop - Removes an item from top of stack
//    peek - Gets the top item on stack without popping it.
//    Ideal backing data structure : LinkedList
//    There is no random access.
//
//    Time complexity :
//
//    push, pop, peek when using a LinkedList is O(1).
//    When using array, push is O(n) because, array may have to be resized.
//
//    If we know the maximum number of items that will be on stack, then array can be a good choice.
//    If memory is tight, array might be good choice.
//    LinkedList is ideal.

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack();

        System.out.println("******************************");
        System.out.println("stack.peek() : " + stack.peek());
        System.out.println("******************************");

        stack.printStack();

        System.out.println("******************************");
        System.out.println("Popped : " + stack.pop());

        System.out.println("******************************");
        System.out.println("stack.peek() : " + stack.peek());

        System.out.println("Popped : " + stack.pop());
        System.out.println("Popped : " + stack.pop());
        System.out.println("Popped : " + stack.pop());
        System.out.println("Popped : " + stack.pop());


    }
}