package org.allinone.collections.map.failsafe;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeListDemo {

    public static void main(String[] args) {

        //FailSafe complete example

        //Create a ArrayList
        List<String> list = new CopyOnWriteArrayList<>();

        //Add elements to the list
        list.add("Arjun");
        list.add("Nag");
        list.add("Babu");

        //Display the elements
        System.out.println("ArrayList :" + list);

        //Iterate over the ArrayList
        for(String element : list){
            System.out.println("Element : " + element);
            //Add an element while iterating
            list.add("Dwija");
        }
    }
}

// Output
// ArrayList :[Arjun, Nag, Babu]
// Element : Arjun
// Element : Nag
// Element : Babu
// Element : Dwija

// FailSafe Scenario based interview questions and answers

// Q1. What is FailSafe in Java?

// Ans. FailSafe is a mechanism that does not throw ConcurrentModificationException while iterating over a collection. It creates a copy of the collection and iterates over it. It does not throw an exception even if the original collection is modified.

// Q2. What is the difference between FailFast and FailSafe?

// Ans. FailFast throws ConcurrentModificationException while iterating over a collection if the collection is modified. FailSafe does not throw ConcurrentModificationException while iterating over a collection if the collection is modified. It creates a copy of the collection and iterates over it.

