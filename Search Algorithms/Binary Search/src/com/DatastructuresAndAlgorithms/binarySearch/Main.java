package com.DatastructuresAndAlgorithms.binarySearch;

public class Main {

    public static void main(String[] args) {

        //  Binary Search:
        //  Data must be sorted!
        //  Chooses the element in the middle of the array and compares it against the search value.
        //  If the middle element is equal to that value, we are done.
        //  If the middle element is greater than the value, search the left half of the array.
        //  if the middle element is less than the value, search the right half of the array.
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

            int valueInMidPoint = input[midPoint];

            if (valueInMidPoint == value)
            {
                return midPoint;
            }
            else if (valueInMidPoint < value)
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

        int midPoint = (start + end) / 2;
        System.out.println("midpoint = " + midPoint);

        int valueInMidPoint = input[midPoint];

        if (valueInMidPoint == value) {
            return midPoint;
        }
        else if (valueInMidPoint < value) {
            return recursiveBinarySearch(input, midPoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, midPoint, value);
        }
    }
}