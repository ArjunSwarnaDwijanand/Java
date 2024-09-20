package org.allinone.programs.normal;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String str = "hello!!!";
        String result = removeDuplicates(str);
        System.out.println(result);
    }

    private static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String currentChar = "" + str.charAt(i);
            if (result.contains(currentChar)) {
                continue;
            } else {
                result = result + currentChar;
            }
        }
        return result;
    }
}

// Output: helo
// Explanation: Here, we have a string str = "hello" from which we need to remove duplicate characters. To remove duplicates, we iterate over each character in the string and check if the character is already present in the result string. If the character is not present, we append it to the result string. This way, we ensure that only the first occurrence of each character is included in the result.
// Complexity Analysis:
// Time Complexity: O(n^2), where n is the length of the input string. In the worst case, for each character in the input string, we iterate over the result string to check if the character is already present.
// Space Complexity: O(n), where n is the length of the input string. We are using additional space to store the result string. The space complexity can be reduced to O(1) by using a boolean array to track the presence of characters in the result string. You can try implementing this optimized approach as an exercise.
// Note: This approach removes duplicate characters from a string. If you want to remove duplicate words from a sentence, you can split the sentence into words and apply a similar logic to remove duplicate words. You can try implementing the removal of duplicate words from a sentence as an exercise.