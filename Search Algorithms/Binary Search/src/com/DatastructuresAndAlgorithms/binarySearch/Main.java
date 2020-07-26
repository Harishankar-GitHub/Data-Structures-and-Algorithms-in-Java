package com.DatastructuresAndAlgorithms.binarySearch;

public class Main {

    public static void main(String[] args) {

        //  Binary Search
        //
        //  Data must be sorted!
        //  Choose the element in the middle of the array and compares it against the search value.
        //  If middle element is equal to that value, we are done.
        //  If middle element is greater than the value, search the left half of the array.
        //  if middle element is less than the value, search the right half of the array.
        //  Time Complexity is O(logn) because, we are dividing the array.

        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, 1));

        System.out.println("**********************************");

        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8888));
        System.out.println(recursiveBinarySearch(intArray, 1));

    }

    public static int iterativeBinarySearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length;

        while (start < end)
        {
            int midPoint = (start + end) / 2;
            System.out.println("Midpoint = " + midPoint);

            if (input[midPoint] == value)
            {
                return midPoint;
            }
            else if (input[midPoint] < value)
            {
                start = midPoint + 1;
            }
            else
            {
                end = midPoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        System.out.println("midpoint = " + midpoint);

        if (input[midpoint] == value) {
            return midpoint;
        }
        else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}