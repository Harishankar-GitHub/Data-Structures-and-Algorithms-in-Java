package com.DatastructuresAndAlgorithms.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity)
    {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) // For push, worst case is O(n) because, we may have to resize the array
    {
        if(top == stack.length)
        {
            // Need to resize the backing array
            // Usually when resizing is done, capacity is doubled.
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Employee pop()
    // For pop, it is O(1) if we are not resizing the array after pop.
    // It is O(n) if we are resizing the array after pop.
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

//        Employee employee = stack[top - 1];
//        top--;
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek()  // Always O(1)
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size()
    {
        return top;
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        for(int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
}
