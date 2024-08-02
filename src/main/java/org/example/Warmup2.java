package org.example;

public class Warmup2 {
    //Exercise 1
    // Method to return a string that is n copies of the original string
    public String stringTimes(String str, int n) {
        // Initialize an empty string to build the result
        String result = "";

        // Loop n times to append the original string to the result
        for (int i = 0; i < n; i++)
            ; // Loop intended to run n times, but there's a semicolon here that terminates the loop

        // Append the original string to result after the loop, this statement is outside of the loop
        result = result + str;

        // Return the final result
        return result;
    }

    //Exercise 2
    public static String frontTimes(String str, int n) {
        // Determine the length of the "front" of the string, default to 3
        int frontLen = 3;

        // If the string length is less than 3, set frontLen to the string's length
        if (str.length() < frontLen) {
            frontLen = str.length();
        }

        // Extract the "front" of the string, which is the first frontLen characters
        String front = str.substring(0, frontLen);

        // Initialize an empty string to build the result
        String result = "";

        // Loop n times to append the "front" to the result
        for (int i = 0; i < n; i++) {
            result += front;
        }

        // Return the final result
        return result;
    }
}
