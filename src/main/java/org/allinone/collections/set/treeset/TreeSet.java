package org.allinone.collections.set.treeset;

import java.util.Set;

public class TreeSet {

    public static void main(String[] args) {

        Set<String> set = new java.util.TreeSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        //set.add(null); // Exception in thread "main" java.lang.NullPointerException

        System.out.println("TreeSet: " + set);

        System.out.println("Size of TreeSet: " + set.size());

        if (set.contains("Banana")) {
            System.out.println("Banana is present in the TreeSet.");
        }

        set.remove("Date");

        System.out.println("TreeSet after removing 'Date': " + set);

        System.out.println("Iterating over TreeSet using an Iterator:");

        java.util.Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating over TreeSet using a for-each loop:");

        for (String fruit : set) {
            System.out.println(fruit);
        }

        set.clear();

        System.out.println("TreeSet after clearing all elements: " + set);



    }
}

// Output

// TreeSet: [Apple, Banana, Cherry, Date]
// Size of TreeSet: 4
// Banana is present in the TreeSet.
// TreeSet after removing 'Date': [Apple, Banana, Cherry]
// Iterating over TreeSet using an Iterator:
// Apple
// Banana
// Cherry
// Iterating over TreeSet using a for-each loop:
// Apple
// Banana
// Cherry
// TreeSet after clearing all elements: []
// TreeSet Scenario based interview questions and answers
// Q1. What is TreeSet in Java?

// Ans. TreeSet is a collection that stores elements in a sorted order. It uses a Red-Black tree to store elements. It maintains the order of elements.

// Q2. What is the difference between HashSet and TreeSet?

// Ans. HashSet stores elements in a hash table, whereas TreeSet stores elements in a sorted order. HashSet does not maintain the order of elements, whereas TreeSet maintains the order of elements.

// Q3. What is the difference between TreeSet and LinkedHashSet?

// Ans. TreeSet stores elements in a sorted order, whereas LinkedHashSet stores elements in a hash table with a linked list. TreeSet maintains the order of elements, whereas LinkedHashSet maintains the order of elements in which they were inserted.

// Q4. What is the difference between TreeSet and TreeMap?

// Ans. TreeSet is a collection that stores elements in a sorted order, whereas TreeMap is a collection that stores key-value pairs in a sorted order. TreeSet stores only elements, whereas TreeMap stores key-value pairs.

// Q5. What is the difference between TreeSet and ArrayList?

// Ans. TreeSet is a collection that stores elements in a sorted order, whereas ArrayList is a collection that stores elements in an array. TreeSet maintains the order of elements, whereas ArrayList maintains the order of elements in which they were inserted.

// Q6. What is the difference between TreeSet and PriorityQueue?

// Ans. TreeSet stores elements in a sorted order, whereas PriorityQueue stores elements based on their priority. TreeSet maintains the order of elements, whereas PriorityQueue does not maintain the order of elements.

