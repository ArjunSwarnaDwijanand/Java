package org.allinone.collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Arjun", 1);
        map.put("Nag", 2);
        map.put("Babu", 3);
        map.put("Dwija", 4);

        System.out.println("LinkedHashMap :" + map.get("Arjun"));

        //update an element
        map.put("Arjun", 10);
        System.out.println("LinkedHashMap :" + map);

        // Removing elements from the LinkedHashMap
        map.remove("Arjun");
        System.out.println("LinkedHashMap :" + map);

        // Iterating over the LinkedHashMap
        for(Map.Entry<String, Integer> entry :map.entrySet()){
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }

    }
}
