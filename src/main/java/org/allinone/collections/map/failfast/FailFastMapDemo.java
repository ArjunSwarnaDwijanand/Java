package org.allinone.collections.map.failfast;

import java.util.HashMap;
import java.util.Map;

public class FailFastMapDemo {

    public static void main(String[] args) {

        // Failfast complete example

        // Create a HashMap
        Map<String, String> map = new HashMap<>();

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
// Exception in thread "main" java.util.ConcurrentModificationException
// 	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1493)
// 	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1516)
// 	at org.allinone.collections.map.failfast.FailFastDemo.main(FailFastDemo.java:29)

