package org.allinone.programs.normal;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
    }

    private static String reverseString(String str) {
        String reversedStr = "";
       for(int i = str.length() -1 ; i >= 0; i--) {
           //System.out.print(str.charAt(i));
           reversedStr = reversedStr + str.charAt(i);
       }
       return reversedStr;
    }
}

// Output: !dlroW ,olleH    // reversed string
// Explanation: Here, we have a string str = "Hello, World!" that we need to reverse. To reverse the string, we iterate over the characters of the string in reverse order and append each character to the result string reversedStr. Finally, we return the reversed string.
// Complexity Analysis:
// Time Complexity: O(n), where n is the length of the input string. We iterate over each character in the string to reverse it.
// Space Complexity: O(n), where n is the length of the input string. We are using additional space to store the reversed string.
// Note: This approach reverses the entire string without using any in-built methods. If you want to reverse the string using in-built methods, you can use StringBuilder or StringBuffer to reverse the string. This approach has a time complexity of O(n) and a space complexity of O(n). You can try implementing this alternative approach as an exercise.

