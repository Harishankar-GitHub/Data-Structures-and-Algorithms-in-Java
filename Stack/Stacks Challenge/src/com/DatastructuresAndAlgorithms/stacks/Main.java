package com.DatastructuresAndAlgorithms.stacks;

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

        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++)
        {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());

        while (!stack.isEmpty())
        {
            reversedString.append(stack.pop());
        }


        System.out.println("*******************************************");

        System.out.println(reversedString);
        System.out.println(reversedString.toString());

        return reversedString.toString().equals(stringNoPunctuation.toString());

    }
}
