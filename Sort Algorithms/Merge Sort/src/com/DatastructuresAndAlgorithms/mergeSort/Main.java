package com.DatastructuresAndAlgorithms.mergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Divide and Conquer Algorithm
        // Recursive Algorithm
        // 2 Phases : Splitting and Merging
        // Splitting phase leads to faster sorting during the merging phase
        // Splitting is logical. We don't create new arrays

        // Splitting phase
        // Start with an unsorted array
        // Divide it into 2 arrays which are unsorted
        // 1st array is left array and 2nd array is right array
        // Split left and right into 2 arrays each
        // Keep splitting until all arrays have 1 element each

        // Merging phase
        // Merge every left right pair of sibling arrays into a sorted array
        // After the first merge, we will have bunch of 2 element sorted arrays
        // Then merge those sorted arrays to end up with bunch of 4-element sorted arrays
        // Repeat until we have a single sorted array

        // Splitting phase is in place (i.e., it doesn't use temporary arrays)
        // Merging phase is not in place (i.e., It does use temporary arrays)

        // Time Complexity is (nlogn) - base 2 : We are repeatedly dividing the array in half during the splitting phase.
        // Stable algorithm

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
