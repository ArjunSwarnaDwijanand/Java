package org.allinone.programs.normal;

public class UpperCasesInString {

    public static void main(String[] args) {
        String str = "Hello World ARJUN";
        System.out.println("Original String: " + str);

        int upperCaseCount = countUpperCaseLetters(str);
        System.out.println("Number of uppercase letters in the string: " + upperCaseCount);
    }

    public static int countUpperCaseLetters(String str) {
        int upperCaseCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upperCaseCount++;
            }
        }
        // return str.replaceAll("[^A-Z]", "").length();
        // for(char c : str.toCharArray()) {
        //     if(Character.isUpperCase(c)) {
        //         upperCaseCount++;
        return upperCaseCount;
    }
}

// Output:
// Original String: Hello World ARJUN
// Number of uppercase letters in the string: 9
// Explanation: Here, we have a string str = "Hello World ARJUN" that contains uppercase and lowercase letters. To count the number of uppercase letters in the string, we iterate over each character in the string and check if it is an uppercase letter using the isUpperCase() method of the Character class. If the character is uppercase, we increment the count of uppercase letters. Finally, we return the count of uppercase letters in the string.
// Complexity Analysis:
// Time Complexity: O(n), where n is the length of the input string. We iterate over each character in the string to count the number of uppercase letters.
// Space Complexity: O(1). We are using a constant amount of extra space to store the count of uppercase letters. The space complexity does not depend on the input string length.
// Note: This approach counts the number of uppercase letters in a given string. If you want to count the number of lowercase letters or special characters in the string, you can modify the condition in the loop accordingly. You can try implementing counting lowercase letters or special characters as an exercise.

