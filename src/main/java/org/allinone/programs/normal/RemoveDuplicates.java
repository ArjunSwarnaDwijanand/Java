package org.allinone.programs.normal;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int[] uniqueArr = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArr[j++] = arr[i];
            }
        }
        uniqueArr[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}

// Output: 1 2 3 4 5    // array with duplicates removed
// Explanation: Here, we have an array arr = {1, 2, 2, 3, 4, 4, 5} and we need to remove duplicates from it. To remove duplicates, we create a new array uniqueArr of the same size as arr. Then, we iterate over the elements of arr and copy only the unique elements to uniqueArr. Finally, we print the array with duplicates removed.
// Complexity Analysis:
// Time Complexity: O(n), where n is the number of elements in the array. We iterate over the array once to remove duplicates.
// Space Complexity: O(n), where n is the number of elements in the array. We are using an additional array of the same size as the input array to store the unique elements.
// Note: This approach removes duplicates from a sorted array. If the input array is unsorted, you can first sort the array using Arrays.sort(arr) or implement a sorting algorithm like QuickSort or MergeSort. The time complexity of sorting algorithms is O(n log n) on average. You can try implementing the removal of duplicates from an unsorted array as an exercise.

