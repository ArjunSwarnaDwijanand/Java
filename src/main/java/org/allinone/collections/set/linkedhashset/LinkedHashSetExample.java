package org.allinone.collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add(null);

        // Adding a duplicate element (This will not be added, as LinkedHashSet doesn't allow duplicates)
        set.add("Apple");

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + set);

        // Checking the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + set.size());

        // Checking if a particular element exists in the LinkedHashSet
        if (set.contains("Banana")) {
            System.out.println("Banana is present in the LinkedHashSet.");
        }

        // Removing an element from the LinkedHashSet
        set.remove("Date");
        System.out.println("LinkedHashSet after removing 'Date': " + set);

        // Iterating over the LinkedHashSet using an iterator
        System.out.println("Iterating over LinkedHashSet using an Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating over the LinkedHashSet using a for-each loop
        System.out.println("Iterating over LinkedHashSet using a for-each loop:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clearing all elements from the LinkedHashSet
        set.clear();
        System.out.println("LinkedHashSet after clearing all elements: " + set);
    }
}

// Output
// LinkedHashSet: [Apple, Banana, Cherry, Date]
// Size of LinkedHashSet: 4
// Banana is present in the LinkedHashSet.
// LinkedHashSet after removing 'Date': [Apple, Banana, Cherry]
// Iterating over LinkedHashSet using an Iterator:
// Apple
// Banana
// Cherry
// Iterating over LinkedHashSet using a for-each loop:
// Apple
// Banana
// Cherry
// LinkedHashSet after clearing all elements: []
//
// LinkedHashSet Scenario based interview questions and answers

// Q1. What is LinkedHashSet in Java?

// Ans. LinkedHashSet is a collection that stores elements in a hash table with a linked list. It maintains the order of elements in which they were inserted.

// Q2. What is the difference between HashSet and LinkedHashSet?

// Ans. HashSet stores elements in a hash table, whereas LinkedHashSet stores elements in a hash table with a linked list. HashSet does not maintain the order of elements, whereas LinkedHashSet maintains the order of elements.

// Q3. What is the difference between LinkedHashSet and TreeSet?

// Ans. LinkedHashSet stores elements in a hash table with a linked list, whereas TreeSet stores elements in a sorted order. LinkedHashSet maintains the order of elements in which they were inserted, whereas TreeSet maintains the order of elements in a sorted order.

// Q4. What is the difference between LinkedHashSet and LinkedHashMap?

// Ans. LinkedHashSet is a collection that stores elements in a hash table with a linked list, whereas LinkedHashMap is a collection that stores key-value pairs in a hash table with a linked list. LinkedHashSet stores only elements, whereas LinkedHashMap stores key-value pairs.

// Q5. What is the difference between LinkedHashSet and ArrayList?

// Ans. LinkedHashSet is a collection that stores elements in a hash table with a linked list, whereas ArrayList is a collection that stores elements in an array. LinkedHashSet maintains the order of elements in which they were inserted, whereas ArrayList maintains the order of elements in which they were inserted.


