package org.allinone.programs.normal;

public class AnagramDemo {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // Output: true
    // Explanation: Here, we have two strings str1 = "listen" and str2 = "silent". To check if they are anagrams, we can use a character count array. We create an array count of size 256 (assuming ASCII characters) and initialize all elements to 0. Then, we iterate over the characters of both strings and increment the count of the character in str1 and decrement the count of the character in str2. Finally, we check if all counts in the array are 0, which indicates that the strings are anagrams.
    // Complexity Analysis:
    // Time Complexity: O(n), where n is the length of the strings str1 and str2. We iterate over the characters of both strings to update the character count array.
    // Space Complexity: O(1), since the character count array has a fixed size of 256 (assuming ASCII characters) and does not depend on the input size.
    // Note: This approach assumes that the input strings contain only ASCII characters. If the input strings can contain Unicode characters, you can use a HashMap to store the character counts instead of an array. This will increase the space complexity to O(n) where n is the number of unique characters in the input strings.
}
