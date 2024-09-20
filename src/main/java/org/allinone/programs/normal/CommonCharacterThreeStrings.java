package org.allinone.programs.normal;

public class CommonCharacterThreeStrings {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "welcome";
        String commonChar = commonChar(str1, str2, str3);
        System.out.println("The common characters in the three strings are: " + commonChar);
    }

    private static String commonChar(String str1, String str2, String str3) {
        String common = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1 && str3.indexOf(ch) != -1) {
                common = common + ch;
            }
        }
        return common;
    }
}

// Output: The common characters in the three strings are: llo
// Explanation: Here, we have three strings str1 = "hello", str2 = "world", and str3 = "welcome". We need to find the common characters in all three strings. To do this, we iterate over each character in the first string str1 and check if the character is present in both str2 and str3 using the indexOf() method. If the character is present in both strings, we add it to the common string. Finally, we return the common characters in all three strings.
// Complexity Analysis:
// Time Complexity: O(n), where n is the length of the first input string str1. We iterate over each character in the first string to find the common characters in all three strings.
// Space Complexity: O(1). We are using a constant amount of extra space to store the common characters. The space complexity does not depend on the input string length.
// Note: This approach finds the common characters in three strings. If you want to find the common characters in more than three strings, you can extend this logic by checking the presence of the character in all the strings. You can try implementing the common characters in more than three strings as an exercise.
