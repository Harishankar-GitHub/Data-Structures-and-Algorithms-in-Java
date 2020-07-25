package com.DatastructuresAndAlgorithms.queues;

public class Main {

//    Queues are Abstract Data type.
//    FIFO - First In First Out
//    Add       - also called enqueue   - adds an item to the end of the queue
//    Remove    - also called dequeue   - removes an item from front of the queue
//    Peek      - gets the item from the front of the queue but doesn't remove it
//
//    2 popular ways of implementing queue :
//
//    1. Arrays
//    2. LinkedLists
//
//    Time complexity :
//
//    Depends on the backing data structure.
//
//    If backing data structure is an array, then the operation is going to be
//    on a constant time or a linear time depends on whether we have to resize the array.
//
//    If backing data structure is a linkedList, these 3 queue operations are going to be
//    always constant time.


    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        queue.add(janeJones);

        queue.printQueue();

        queue.remove();
        queue.remove();

        System.out.println("After removing : *******************************");

        queue.printQueue();

        System.out.println("Peek : " + queue.peek());

        System.out.println("After peek : ");

        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.remove();
//        queue.remove(); // This remove will throw NoSuchElementException.

        queue.add(mikeWilson);

        System.out.println("After removing all");

        queue.printQueue();


    }
}
