package org.allinone.collections.List;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of String type
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Print the LinkedList
        System.out.println("Initial LinkedList: " + fruits);

        // Add an element at the first position
        fruits.addFirst("Pineapple");
        System.out.println("After addFirst(): " + fruits);

        // Add an element at the last position
        fruits.addLast("Grapes");
        System.out.println("After addLast(): " + fruits);

        // Accessing elements by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // Modify elements in the LinkedList
        fruits.set(1, "Strawberry");
        System.out.println("After set(): " + fruits);

        // Removing elements from the LinkedList
        fruits.removeFirst(); // Removes the first element
        System.out.println("After removeFirst(): " + fruits);

        fruits.removeLast(); // Removes the last element
        System.out.println("After removeLast(): " + fruits);

        fruits.remove(2); // Removes the element at index 2
        System.out.println("After remove(index): " + fruits);

        // Iterating over the LinkedList using Iterator
        Iterator<String> iterator = fruits.iterator();
        System.out.print("LinkedList elements using Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Iterating over the LinkedList using ListIterator
        ListIterator<String> listIterator = fruits.listIterator();
        System.out.print("LinkedList elements using ListIterator (forward): ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // Iterating in reverse order using ListIterator
        System.out.print("LinkedList elements using ListIterator (backward): ");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        // Check if the LinkedList contains a specific element
        if (fruits.contains("Banana")) {
            System.out.println("The LinkedList contains Banana.");
        } else {
            System.out.println("The LinkedList does not contain Banana.");
        }

        // Get the size of the LinkedList
        System.out.println("Size of LinkedList: " + fruits.size());

        // Clear the LinkedList
        fruits.clear();
        System.out.println("LinkedList after clear(): " + fruits);
    }
}

