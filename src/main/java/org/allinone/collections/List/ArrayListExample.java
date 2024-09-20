package org.allinone.collections.List;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Displaying the ArrayList
        System.out.println("Fruits List: " + fruits);

        // Accessing elements from the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        // Updating an element at a specific index
        fruits.set(1, "Strawberry");
        System.out.println("Updated Fruits List: " + fruits);

        // Removing an element by index
        fruits.remove(2);
        System.out.println("Fruits List after removal: " + fruits);

        // Checking if an element exists in the ArrayList
        boolean hasMango = fruits.contains("Mango");
        System.out.println("Does the list contain Mango? " + hasMango);

        // Finding the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the Fruits List: " + size);

        // Iterating over the ArrayList using a for-each loop
        System.out.println("Iterating over the Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("Fruits List after clearing: " + fruits);
        System.out.println("Is the Fruits List empty? " + fruits.isEmpty());
    }
}

