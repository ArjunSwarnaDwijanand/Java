package org.allinone.programs.normal;

public class MergeTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArr = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArr[n1 + i] = arr2[i];
        }
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }
}

// Output: 1 2 3 4 5 6    // merged array
// Explanation: Here, we have two arrays arr1 = {1, 2, 3} and arr2 = {4, 5, 6} that we need to merge. To merge the arrays, we create a new array mergedArr of size n1 + n2, where n1 and n2 are the lengths of arr1 and arr2, respectively. Then, we copy the elements of arr1 and arr2 to mergedArr in order. Finally, we print the merged array.
// Complexity Analysis:
// Time Complexity: O(n1 + n2), where n1 and n2 are the lengths of the input arrays arr1 and arr2, respectively. We iterate over both arrays to copy their elements to the merged array.
// Space Complexity: O(n1 + n2), where n1 and n2 are the lengths of the input arrays arr1 and arr2, respectively. We are using an additional array of size n1 + n2 to store the merged elements.
// Note: This approach assumes that the input arrays are of fixed sizes. If the input arrays can have varying lengths, you can use ArrayList or other dynamic data structures to store the merged elements. This will increase the space complexity to O(n1 + n2) where n1 and n2 are the lengths of the input arrays. You can try implementing this dynamic merging as an exercise.

