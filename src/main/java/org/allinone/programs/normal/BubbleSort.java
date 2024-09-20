package org.allinone.programs.normal;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {55, -95, 4, 64, -1, 255, 100};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Output: [-95, -1, 4, 55, 64, 100, 255]
// Explanation: In the bubble sort algorithm, we repeatedly swap adjacent elements if they are in the wrong order. In each iteration, the largest element in the unsorted portion of the array "bubbles up" to its correct position. The algorithm continues this process until the entire array is sorted. Here, we have an input array arr = {55, -95, 4, 64, -1, 255, 100} that we need to sort in ascending order. After applying the bubble sort algorithm, the sorted array is [-95, -1, 4, 55, 64, 100, 255].
// Complexity Analysis:
// Time Complexity: O(n^2), where n is the number of elements in the input array. In the worst case, the bubble sort algorithm requires n-1 passes over the array, and each pass involves comparing and swapping adjacent elements. This results in a time complexity of O(n^2).
// Space Complexity: O(1), since the bubble sort algorithm sorts the array in-place without using any additional space. The space complexity is constant and does not depend on the input size.
// Note: Bubble sort is a simple and inefficient sorting algorithm, typically used for educational purposes or small datasets. For larger datasets, more efficient sorting algorithms like quicksort, mergesort, or heapsort are preferred due to their better time complexity. You can try implementing these sorting algorithms as an exercise.
