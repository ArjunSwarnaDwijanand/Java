package org.allinone.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDuplicates {
    //Does hashmap allowed duplicate keys in java?
    //No, HashMap does not allow duplicate keys in java. If you try to insert the duplicate key in HashMap, it will replace the value of the corresponding key.
    //In the below example, we are trying to insert the duplicate key "Arjun" with the value 10. It will replace the value of the key "Arjun" with 10.
    //Also, when we try to remove the key "Arjun" from the HashMap, it will remove the key "Arjun" with the value 10.
    //Output
    //HashMap :1
    //HashMap :2
    //HashMap :{Arjun=10, Babu=3, Dwija=4, Nag=2}
    //HashMap :{Babu=3, Dwija=4, Nag=2}
    //Key : Babu Value : 3
    //Key : Dwija Value : 4
    //Key : Nag Value : 2

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
