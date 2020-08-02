package com.DatastructuresAndAlgorithms.recursion;

import java.time.Duration;
import java.time.Instant;

public class Main {

    public static void main(String[] args) {

        Instant start1 = Instant.now();

        System.out.println("Iterative : " + iterativeFactorial(3));
//        System.out.println("Iterative : " + iterativeFactorial(3000));

        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).getNano();
        System.out.printf("%d nanoseconds \n", timeElapsed1);


        Instant start2 = Instant.now();

        System.out.println("Recursive : " + recursiveFactorial(3));
//        System.out.println("Recursive : " + recursiveFactorial(3000));

        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).getNano();
        System.out.printf("%d nanoseconds \n", timeElapsed2);


    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n * (n - 1)!

    public static int iterativeFactorial(int num)
    {
        if (num == 0)
        {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num)
    {
        if (num == 0)
        {
            return 1;
        }

        return num * recursiveFactorial((num - 1));
    }
}
