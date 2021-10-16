package com.DatastructuresAndAlgorithms.insertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Time Complexity : O(n^2) - Quadratic
        // It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items
        // and 1,000,000 steps to sort 1000 items.
        // Stable algorithm.

        // Assuming 1st element in the array is sorted.

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }
        System.out.println(Arrays.toString(intArray));
    }
}