package com.DatastructuresAndAlgorithms.selectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Time Complexity : O(nsquare) - Quadratic
        // It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items
        // and 1,000,000 steps to sort 1000 items
        // Doesn't require as much swapping as bubble sort
        // Unstable algorithm

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++)
            {
                if (intArray[i] > intArray[largest])
                {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] intArray, int i, int j)
    {
        if (intArray[i] == intArray[j])
        {
            return;
        }
        else
        {
            int temp = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = temp;
        }
    }
}
