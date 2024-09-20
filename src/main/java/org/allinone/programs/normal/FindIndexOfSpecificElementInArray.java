package org.allinone.programs.normal;

public class FindIndexOfSpecificElementInArray {

        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5};
            int elementToFind = 3;

            int index = findIndexOfElement(arr, elementToFind);

            if (index != -1) {
                System.out.println("Element " + elementToFind + " found at index: " + index);
            } else {
                System.out.println("Element " + elementToFind + " not found in the array.");
            }
        }

        public static int findIndexOfElement(int[] arr, int elementToFind) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == elementToFind) {
                    return i;
                }
            }
            return -1;
        }
}

//output
//Element 3 found at index: 2
// Explanation: Here, we have an array arr = {1, 2, 3, 4, 5} and an element elementToFind = 3. We need to find the index of the element elementToFind in the array arr. To find the index of the element in the array, we iterate over each element in the array using a for loop. For each element, we check if it is equal to the elementToFind. If the element is found, we return the index of the element. If the element is not found, we return -1. In this case, the element 3 is found at index 2 in the array arr.
// Complexity Analysis:
// Time Complexity: O(n), where n is the number of elements in the input array. We iterate over each element in the array to find the index of the specific element.
// Space Complexity: O(1). We are using constant space to store the variables i and index. The space complexity is independent of the input array size.
// Note: You can modify the input array arr and the elementToFind to test the program with different inputs. This program demonstrates a simple way to find the index of a specific element in an array using a linear search algorithm. You can also implement other search algorithms, such as binary search, for sorted arrays to improve the search efficiency. You can experiment with different search algorithms and optimize the search process based on the input data characteristics.
