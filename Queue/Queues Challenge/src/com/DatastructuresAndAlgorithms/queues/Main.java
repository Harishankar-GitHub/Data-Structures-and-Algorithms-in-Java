package com.DatastructuresAndAlgorithms.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        Stack<Character> stack = new Stack<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++)
        {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                stack.push(c);
                queue.addLast(c);
            }
        }

        while (!stack.isEmpty())
        {
            if(!stack.pop().equals(queue.removeFirst()))
            {
                return false;
            }
        }

        return true;
    }
}
