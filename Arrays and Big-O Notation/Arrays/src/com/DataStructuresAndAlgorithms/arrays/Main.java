package com.DataStructuresAndAlgorithms.arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[7];
        // Size of the array must be specified while creating because arrays are not dynamic.
        // We can't increase/decrease the size once an array is created.

        // Arrays are stored in Contiguous block in memory.
        // Every element occupies same amount of space in memory.
        // If we have an array of objects, then the array holds only the references of objects
        // which also occupies same amount of space in memory.

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -11;

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }

        // Retrieving an element in an array :
        // Arrays are stored in Contiguous block in memory.
        // For example, the array starts from 12 in the memory.

        // int occupies 4 bytes
        // intArray[0] = 12 + (0 * 4) = 12
        // intArray[1] = 12 + (1 * 4) = 16
        // intArray[2] = 12 + (2 * 4) = 20
        // intArray[3] = 12 + (3 * 4) = 24 and so on.

        // Steps are,
        // 1. Multiply size of element by index.
        // 2. Get the start address of memory.
        // 3. Add start address to the result of multiplication.

        // It doesn't matter how many elements we have in an array.

        // Even if we have 10000000 elements in an array and we need to access 98547th element,
        // same 3 steps is needed.

        // O(1) - Retrieval is fast if the index of the element is known.
        // O(n) - Retrieval is difficult if the index of the element is unknown.

        // Retrieve with index                  - O(1) - Constant time
        // Retrieve without index               - O(n) - Linear time
        // Adding an element to a full array    - O(n)
        // Adding an element to the end of an array (when array is not full)    - O(1)
        // Insert or update an element at a specific index                      - O(1)
        // Delete an element by setting it to null                              - O(1)
        // Delete an element by shifting elements                               - O(n)
        
    }
}
