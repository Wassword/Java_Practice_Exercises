package org.example;

import java.util.HashMap;
import java.util.Map;
//Exercise 1
public class Map2 {
public Map<String,Integer> word0(String[] strings) {
    Map<String,Integer> map = new HashMap<>();
    for (String s : strings) {
        map.put(s , 0);
    }
    return map;

}
    //Exercise 2
    public static Map<String, Integer> stringLengths(String[] strings) {
        // Create a new HashMap to store the result
        Map<String, Integer> map = new HashMap<>();

        // Loop through each string in the array
        for (String str : strings) {
            // Put the string as the key and its length as the value into the map
            map.put(str, str.length());
        }

        // Return the populated map
        return map;
    }

}
