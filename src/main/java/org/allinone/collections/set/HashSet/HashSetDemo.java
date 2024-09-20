package org.allinone.collections.set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        // real time example

        // Create a HashSet
        Set<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Arjun");
        set.add("Nag");
        set.add("Babu");
        set.add("Dwija");
        set.add(null);

        // Display the elements
        System.out.println("HashSet :" + set);

        // Add duplicate element
        set.add("Arjun");

        // Display the elements
        System.out.println("HashSet :" + set);

        // Remove an element
        set.remove("Arjun");

        // Display the elements
        System.out.println("HashSet :" + set);

        // Iterate over the HashSet
        for(String element : set){
            System.out.println("Element : " + element);
        }

    }
}

// Output
// HashSet :[Arjun, Babu, Dwija, Nag]
// HashSet :[Arjun, Babu, Dwija, Nag]
// HashSet :[Babu, Dwija, Nag]
// Element : Babu
// Element : Dwija
// Element : Nag

// HashSet Scenario based interview questions and answers

// Q1. What is HashSet in Java?

// Ans. HashSet is a collection that stores elements in a hash table. It uses the hash code of the object to store elements. It does not maintain the order of elements.

// Q2. What is the difference between HashSet and TreeSet?

// Ans. HashSet stores elements in a hash table, whereas TreeSet stores elements in a sorted order. HashSet does not maintain the order of elements, whereas TreeSet maintains the order of elements.

// Q3. What is the difference between HashSet and LinkedHashSet?

// Ans. HashSet stores elements in a hash table, whereas LinkedHashSet stores elements in a hash table with a linked list. HashSet does not maintain the order of elements, whereas LinkedHashSet maintains the order of elements.

// Q4. What is the difference between HashSet and HashMap?

// Ans. HashSet is a collection that stores elements in a hash table, whereas HashMap is a collection that stores key-value pairs in a hash table. HashSet stores only elements, whereas HashMap stores key-value pairs.

// Q5. What is the difference between HashSet and ArrayList?

// Ans. HashSet is a collection that stores elements in a hash table, whereas ArrayList is a collection that stores elements in an array. HashSet does not maintain the order of elements, whereas ArrayList maintains the order of elements.

