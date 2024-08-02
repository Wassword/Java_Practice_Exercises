package org.example;
public class Warmup1 {

    // Exercise 1: Determines if we can sleep in based on whether it's a weekday or we're on vacation
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // If it's not a weekday, or we're on vacation, we can sleep in
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
        // Note: This could also be written as simply "return !weekday || vacation;"
    }

    // Exercise 2: Checks if a number is within 10 of 100 or 200
    public boolean nearHundred(int n) {
        // Return true if the absolute difference between n and 100 or 200 is 10 or less
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    // Exercise 3: Determines if the monkeys are in trouble based on their smiling status
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // We're in trouble if both monkeys are smiling or neither is smiling
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
        // This could also be simplified as:
        // return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or even shorter:
        // return (aSmile == bSmile);
    }

    // Exercise 4: Returns the sum of two numbers, or double the sum if the numbers are the same
    public int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;

        // Double the sum if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        // Return the final sum
        return sum;
    }

    // Exercise 5: Returns the absolute difference between n and 21, or double the difference if n is greater than 21
    public int diff21(int n) {
        // If n is 21 or less, return the difference between 21 and n
        if (n <= 21) {
            return 21 - n;
        } else {
            // If n is greater than 21, return double the difference
            return (n - 21) * 2;
        }
    }

    // Exercise 6: Checks if one number is positive and the other is negative, or if both are negative when the negative parameter is true
    public boolean posNeg(int a, int b, boolean negative) {
        // If negative is true, return true only if both numbers are negative
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            // Otherwise, return true if one number is positive and the other is negative
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

}
