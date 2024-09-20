package org.allinone.collections.map.failsafe;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeMapDemo {
    public static void main(String[] args) {

        // FailSafe complete example

        // Create a HashMap
        Map<String, String> map = new ConcurrentHashMap<>();

        // Add elements to the map
        map.put("1", "Arjun");
        map.put("2", "Nag");
        map.put("3", "Babu");
        map.put("4", "Dwija");

        // Display the elements
        System.out.println("HashMap :" + map);

        // Iterate over the HashMap
        for(String key : map.keySet()){
            System.out.println("Key : " + key + " Value : " + map.get(key));
            // Add an element while iterating
            map.put("5", "Sai");
        }

    }
}

// Output
// HashMap :{1=Arjun, 2=Nag, 3=Babu, 4=Dwija}
// Key : 1 Value : Arjun
// Key : 2 Value : Nag
// Key : 3 Value : Babu
// Key : 4 Value : Dwija
// Key : 5 Value : Sai
