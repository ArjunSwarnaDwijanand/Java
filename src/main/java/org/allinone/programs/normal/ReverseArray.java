package org.allinone.programs.normal;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] reversedArr = new int[n];
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }
}

// Output: 5 4 3 2 1    // reversed array
// Explanation: Here, we have an array arr = {1, 2, 3, 4, 5} and we need to reverse it. So, we create a new array reversedArr of the same size as arr. Then, we iterate over the elements of arr and copy them to reversedArr in reverse order. Finally, we print the reversed array.
// Complexity Analysis:
// Time Complexity: O(n), where n is the number of elements in the array.
// Space Complexity: O(n), where n is the number of elements in the array. We are using an additional array of the same size as the input array to store the reversed elements.
// Note: This approach uses an additional array to store the reversed elements. If you want to reverse the array in-place (i.e., without using additional space), you can use a two-pointer approach where you swap elements from the start and end of the array until they meet in the middle. This approach has a time complexity of O(n) and a space complexity of O(1). You can try implementing this in-place reversal as an exercise.
