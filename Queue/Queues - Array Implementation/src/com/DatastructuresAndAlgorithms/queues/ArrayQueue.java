package com.DatastructuresAndAlgorithms.queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity)
    {
        queue = new Employee[capacity];
    }

    public void add(Employee employee)
            // While adding, back is incremented and when we remove few elements, back is not decremented.
            // So, it might lead to resizing of array often even when the array is not full.
    {
        if (back == queue.length)
        {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee remove()
    {
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;

        // In the above code, we got the front element from queue.
        // If that was the only element, then we need to reset the front and back positions to 0.

        if(size() == 0)
        {
            front = 0;
            back = 0;
        }

        return employee;
    }

    public Employee peek()
    {
        if (size() == 0)
        {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size()
    {
        return back - front;
    }

    public void printQueue()
    {
        for (int i = front; i < back; i++)
        {
            System.out.println(queue[i]);
        }
    }
}
