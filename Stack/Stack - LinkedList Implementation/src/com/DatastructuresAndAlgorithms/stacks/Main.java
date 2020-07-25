package com.DatastructuresAndAlgorithms.stacks;
//                                          STACK - LINKEDLIST IMPLEMENTATION
public class Main {

    public static void main(String[] args) {

        // The time complexity for push, pop and peek is O(1).
        // Because, we are always working at the item at the head of the list.
        // So, the steps involved for push, pop and peek don't depend on number of items on the list.

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();

        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        stack.printStack();
        System.out.println("**************************");
        System.out.println(stack.peek());
        System.out.println("**************************");
        stack.printStack();
        System.out.println("**************************");

        System.out.println(stack.pop());
        System.out.println("**************************");
        System.out.println(stack.peek());

    }
}
