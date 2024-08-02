package org.example;

public class Array1 {
    //Exercise 1
    public boolean firstLast6(int[] nums) {
        // Check if the array has at least one element and if 6 is the first or last element
        if (nums.length >= 1) {
            // Check if the first element is 6 or the last element is 6
            return (nums[0] == 6 || nums[nums.length - 1] == 6);
        }
        // If the array length is less than 1, return false (although the prompt says array length is 1 or more)
        return false;
    }

}

    //Exercise 2
    public static boolean isFirstAndLastEqual(int[] nums) {
        // Check if the array has length 1 or more
        if (nums.length >= 1) {
            // Check if the first element and the last element are equal
            return nums[0] == nums[nums.length - 1];
        }
        // If the array has less than 1 element (though per the prompt, it should be 1 or more)
        return false;
    }



