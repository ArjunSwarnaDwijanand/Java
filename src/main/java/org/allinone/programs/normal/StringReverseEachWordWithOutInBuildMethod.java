package org.allinone.programs.normal;

public class StringReverseEachWordWithOutInBuildMethod {

        public static void main(String[] args) {
            String str = "Hello World";
            String[] words = str.split(" ");
            String reverseString = "";
            for (String word : words) {
                String reverseWord = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reverseWord = reverseWord + word.charAt(i);
                }
                reverseString = reverseString + reverseWord + " ";
            }
            System.out.println(reverseString);
        }
}

// Output: olleH dlroW    // reversed string
// Explanation: Here, we have a string str = "Hello World" that we need to reverse each word. To reverse each word in the string, we first split the string into words using the split() method with a space delimiter. Then, we iterate over each word and reverse it character by character. Finally, we append the reversed word to the result string reverseString.
// Complexity Analysis:
// Time Complexity: O(n), where n is the length of the input string. We iterate over each character in the string to reverse each word.
// Space Complexity: O(n), where n is the length of the input string. We are using additional space to store the reversed words and the final reversed string.
// Note: This approach reverses each word in the string without using any in-built methods. If you want to reverse each word using in-built methods, you can split the string into words, reverse each word using StringBuilder or StringBuffer, and then join the reversed words back together. This approach has a time complexity of O(n) and a space complexity of O(n). You can try implementing this alternative approach as an exercise.

