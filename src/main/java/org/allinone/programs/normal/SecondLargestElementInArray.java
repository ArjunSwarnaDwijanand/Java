package org.allinone.programs.normal;

public class SecondLargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int secondLargest = findSecondLargestElement(arr);
        System.out.println("Second largest element in the array is: " + secondLargest);
    }

    public static int findSecondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

// Output:
// Second largest element in the array is: 40
// In the above program, we have an array of integers. We have to find the second largest element in the array.
// We have created a method findSecondLargestElement() to find the second largest element in the array.
// We have initialized two variables largest and secondLargest with Integer.MIN_VALUE.
// We iterate over the elements of the array and update the largest and secondLargest elements accordingly.
// Finally, we return the secondLargest element.
// Complexity Analysis:
// Time Complexity: O(n), where n is the number of elements in the array. We iterate over the array once to find the second largest element.
// Space Complexity: O(1), since we are using a fixed number of variables (largest, secondLargest) to store the largest and second largest elements, which do not depend on the input size.
// Note: This approach finds the second largest element in a single pass over the array. If you need to find the kth largest or smallest element in the array, you can use sorting or other algorithms like QuickSelect, which have a time complexity of O(n log n) or O(n) on average, respectively. You can try implementing these algorithms as an exercise.