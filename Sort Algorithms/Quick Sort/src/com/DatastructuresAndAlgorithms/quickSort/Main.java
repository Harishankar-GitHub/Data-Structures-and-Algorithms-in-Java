package com.DatastructuresAndAlgorithms.quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Divide and Conquer Algorithm
        // Recursive Algorithm
        // Uses pivot element to partition the array into 2 parts
        // Elements < pivot to its left, elements > pivot to its right
        // pivot will then be in its correct sorted position

        // Time Complexity is (nlogn) - base 2 : We are repeatedly dividing the array in half during the splitting phase.
        // Unstable algorithm
        // In place algorithm

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        System.out.println(Arrays.toString(intArray));
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
