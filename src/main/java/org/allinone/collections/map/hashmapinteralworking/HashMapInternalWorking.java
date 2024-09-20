package org.allinone.collections.map.hashmapinteralworking;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalWorking {

    public static void main(String[] args) {
        // Create a HashMap
        Map<Employee, String> map = new HashMap<>();

        // Add elements to the HashMap
        Employee emp1 = new Employee(1, "Arjun");
        Employee emp2 = new Employee(2, "Nag");
        Employee emp3 = new Employee(3, "Babu");
        Employee emp4 = new Employee(4, "Dwija");

        map.put(emp1, "Developer");
        map.put(emp2, "Manager");
        map.put(emp3, "Analyst");
        map.put(emp4, "Tester");

        // Retrieve and display elements
        System.out.println("Value for key 'emp1': " + map.get(emp1));
        System.out.println("Value for key 'emp2': " + map.get(emp2));

        // Update an element
        map.put(emp1, "Senior Developer");
        System.out.println("Updated value for key 'emp1': " + map.get(emp1));

        // Remove an element
        map.remove(emp2);
        System.out.println("Value for key 'emp2' after removal: " + map.get(emp2));

        // Iterate over elements
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
