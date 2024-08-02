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
    public Map<String, String> mapShare(Map<String, String> map) {
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

    public Map<String, String> mapAB(Map<String, String> map) {
        // Check if both keys "a" and "b" are present in the map
        if (map.containsKey("a") && map.containsKey("b")) {
            // Concatenate the values of "a" and "b"
            String abValue = map.get("a") + map.get("b");

            // Store the concatenated value under the key "ab"
            map.put("ab", abValue);
        }

        // Return the modified map
        return map;
    }


