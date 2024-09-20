package org.allinone.collections.map.failfast;

import java.util.ArrayList;
import java.util.List;

public class FailFastListDemo {
    public static void main(String[] args) {

        // Failfast complete example

        // Create a ArrayList
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Arjun");
        list.add("Nag");
        list.add("Babu");
        list.add("Dwija");

        // Display the elements
        System.out.println("ArrayList :" + list);

        // Iterate over the ArrayList
        for(String element : list){
            System.out.println("Element : " + element);
            // Add an element while iterating
            list.add("Sai");
        }

    }
}

// Output
// ArrayList :[Arjun, Nag, Babu, Dwija]
// Element : Arjun
// Exception in thread "main" java.util.ConcurrentModificationException
