package com.DatastructuresAndAlgorithms.linkedLists;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;         // Whenever a node is added, size is incremented.
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public EmployeeNode removeFromFront()
    {
        if(isEmpty())
        {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
//        removedNode.setNext(null);
        return removedNode;
    }

    public void printList()
    {
        EmployeeNode current = head;
        System.out.println("HEAD -> ");
        while (current != null)
        {
            System.out.print(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
