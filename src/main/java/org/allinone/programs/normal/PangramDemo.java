package org.allinone.programs.normal;

public class PangramDemo {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
    }

    public static boolean isPangram(String str) {
        if (str.length() < 26) {
            return false;
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (str.indexOf(ch) < 0 && str.indexOf((char) (ch + 32)) < 0) {
                return false;
            }
        }
        return true;
    }
}

// Output: true
// Explanation: The given string "The quick brown fox jumps over the lazy dog" contains all the English alphabets at least once. Hence, it is a pangram. The isPangram() method checks if the given string is a pangram or not. It iterates over each character from 'A' to 'Z' and checks if the character is present in the given string using the indexOf() method. If any character is not found in the string, it returns false. Otherwise, it returns true. In this case, all the characters from 'A' to 'Z' are present in the given string, so the method returns true.
// Complexity Analysis:
// Time Complexity: O(1). The method has a constant time complexity as it iterates over a fixed number of characters (26 characters) to check if they are present in the given string.
// Space Complexity: O(1). The method uses a constant amount of extra space to store the characters being checked. The space complexity does not depend on the input string length.
// Note: A pangram is a sentence containing every letter of the alphabet at least once. If you want to check for pangrams in different languages or character sets, you can modify the character range in the method. You can try implementing pangram checking for different character sets as an exercise.
