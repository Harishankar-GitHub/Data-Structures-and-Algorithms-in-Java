package com.DatastructuresAndAlgorithms.linkedLists;

public class Main {

    public static void main(String[] args) {

//        LinkedList is a data structure.
//        It is a sequential list of objects.
//        But here, arrays are not involved.
//        In LinkedList, each item is aware of the next item in the list.
//        Because, each item contains a link to next item in the list.
//        This is different from arrays and lists that are backed by arrays.
//
//        Each item in a list is called a Node.
//        The first item is called Head of the list.
//
//        Inserting a node at the beginning is always constant time complexity O(1).
//        Removing a node from the beginning is always constant time complexity O(1).

//        SinglyLinkedList is best used when we want to insert or remove elements from the beginning.
//        A LinkedList can continue to grow without having to be resized.
//        In lists, once array which is created in the background of the list is full, the array needs to be resized.

//        One disadvantage with LinkedList is we have to store that extra field with every value.
//        Hence, it consumes more memory.



        Employee jane = new Employee("Jane", "Jones", 123);
        Employee john = new Employee("John", "Doe", 4567);
        Employee mary = new Employee("Mary", "Smith", 22);
        Employee mike = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println("Is list empty ? - " + employeeLinkedList.isEmpty());
        employeeLinkedList.addToFront(jane);
        employeeLinkedList.addToFront(john);
        employeeLinkedList.addToFront(mary);
        employeeLinkedList.addToFront(mike);

        employeeLinkedList.printList();

        System.out.println("List size : " + employeeLinkedList.getSize());

        employeeLinkedList.removeFromFront();
        System.out.println("List size : " + employeeLinkedList.getSize());
        employeeLinkedList.printList();
    }
}
