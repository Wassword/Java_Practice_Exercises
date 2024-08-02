package org.example;

import java.util.Map;

public class Map1 {
    //Exercise 1

    public Map<String, String> mapBully(Map<String, String> map) {
        // Check if the map contains the key "a"
        if (map.containsKey("a")) {
            // If the key "a" exists, copy its value to the key "b"
            map.put("b", map.get("a"));

            // Set the value associated with the key "a" to an empty string
            map.put("a", "");
        }

        // Return the modified map
        return map;
    }
    //Exercise 2
    public static Map<String, String> mapShare(Map<String, String> map) {
        // Check if the key "a" exists and has a value
        if (map.containsKey("a")) {
            // Set the key "b" to have the same value as "a"
            map.put("b", map.get("a"));
        }

        // Remove the key "c" from the map if it exists
        map.remove("c");

        // Return the modified map
        return map;
    }
}

    //Exercise 3

    public static Map<String, String> mapShare(Map<String, String> map) {
        // Check if the key "a" has a value
        if (map.containsKey("a")) {
            // Set the key "b" to have the same value as "a"
            map.put("b", map.get("a"));
        }

        // Remove the key "c" from the map, if it exists
        map.remove("c");

        // Return the modified map
        return map;
    }
