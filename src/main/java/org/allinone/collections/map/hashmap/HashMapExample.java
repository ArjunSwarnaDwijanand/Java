package org.allinone.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("Arjun", 1);
        map.put("Nag", 2);
        map.put("Babu", 3);
        map.put("Dwija", 4);

        // Retrieving elements from the HashMap
        System.out.println("HashMap :" + map.get("Arjun"));
        System.out.println("HashMap :" + map.get("Nag"));

        //update an element
        map.put("Arjun", 10);

        System.out.println("HashMap :" + map);

        // Removing elements from the HashMap

        map.remove("Arjun");
        System.out.println("HashMap :" + map);

        // Iterating over the HashMap
        for(Map.Entry<String, Integer> entry :map.entrySet()){
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}

// HashMap Scenario based interview questions and answers

