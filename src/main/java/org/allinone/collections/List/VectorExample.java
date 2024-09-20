package org.allinone.collections.List;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector with initial capacity 5 and increment by 2
        Vector<String> vector = new Vector<>(5, 2);

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Grapes");
        vector.add("Mango");

        // Printing the elements in the Vector
        System.out.println("Elements in Vector: " + vector);

        // Accessing elements by index
        System.out.println("Element at index 2: " + vector.get(2));

        // Modifying an element
        vector.set(1, "Pineapple");
        System.out.println("After modifying, Vector: " + vector);

        // Removing an element
        vector.remove("Orange");
        System.out.println("After removing, Vector: " + vector);

        // Checking if the Vector contains a specific element
        boolean containsApple = vector.contains("Apple");
        System.out.println("Vector contains 'Apple': " + containsApple);

        // Size and capacity of the Vector
        System.out.println("Size of Vector: " + vector.size());
        System.out.println("Capacity of Vector: " + vector.capacity());

        // Using Enumeration to iterate through the Vector
        Enumeration<String> enumeration = vector.elements();
        System.out.print("Elements in Vector using Enumeration: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        // Clearing all elements
        vector.clear();
        System.out.println("\nAfter clearing, Vector: " + vector);
    }
}

