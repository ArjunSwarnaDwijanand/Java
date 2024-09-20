package org.allinone.programs.normal;

public class MaxMinNumbers {

        public static void main(String[] args) {

            int[] arr = {5, 2, 7, -3, 9, 1};
            int n = arr.length;
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }
}

// Output:
// Maximum number: 9
// Minimum number: 1
// Explanation: Here, we have an array arr = {5, 2, 7, 3, 9, 1} and we need to find the maximum and minimum numbers in the array. We initialize two variables max and min to the first element of the array. Then, we iterate over the elements of the array and update max and min if we find a larger or smaller element, respectively. Finally, we print the maximum and minimum numbers.
// Complexity Analysis:
// Time Complexity: O(n), where n is the number of elements in the array. We iterate over the array once to find the maximum and minimum numbers.
// Space Complexity: O(1), since we are using a fixed number of variables (max, min) to store the maximum and minimum numbers, which do not depend on the input size.
// Note: This approach finds the maximum and minimum numbers in a single pass over the array. If you need to find the kth largest or smallest element in the array, you can use sorting or other algorithms like QuickSelect, which have a time complexity of O(n log n) or O(n) on average, respectively. You can try implementing these algorithms as an exercise.

