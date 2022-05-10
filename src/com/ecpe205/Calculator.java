package com.ecpe205;

public class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    public boolean isOdd(int value) {
        return value % 2 == 1;
    }

    //create a method that computes base x power of y
    //use parameterizedTest methodsource - 5 sets to test
    public double ans(int x, int y) {
        return Math.pow(x, y);
    }

    //create a method that computes for the factorial of a value
    //use parameterizedTest- 5 values to test
    public long factorial(int f) {
        return (1 > f) ? 1 : f * factorial(f - 1);
    }

    //create a method that checks if a given string is a palindrome
    //use parameterizedTest - 5 values to test


    //create a method that accepts an array of integer values, the method then sorts the value in ascending order
    //** you may choose whatever sort data structure (bubble sort, shell sort,...)
    //use parameterizedTest methodSource

    void bubbleSort(int b[]) {
        int n = b.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (b[j] > b[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
    }
}