package org.allinone.programs.normal;

public class SumOfDigitsNumbersAndChar {

    public static void main(String[] args) {
        String str = "hello123";
        int sum = sumOfDigits(str);
        System.out.println("The sum of digits in the string " + str + " is: " + sum);
    }

    private static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum = sum + Integer.parseInt(ch + "");
            }
        }
        return sum;
    }
}

// Output: The sum of digits in the string hello123 is: 6
// Explanation: Here, we have a string str = "hello123" that contains both characters and digits. We need to find the sum of all the digits in the string. To do this, we iterate over each character in the string and check if it is a digit using the Character.isDigit() method. If the character is a digit, we convert it to an integer using Integer.parseInt() and add it to the sum. Finally, we return the sum of all the digits in the string.
// Complexity Analysis:
// Time Complexity: O(n), where n is the length of the input string. We iterate over each character in the string to find the sum of digits.
// Space Complexity: O(1). We are using a constant amount of extra space to store the sum of digits. The space complexity does not depend on the input string length.
// Note: This approach calculates the sum of digits in a string. If you want to calculate the sum of all numbers (not just digits) in a string, you can modify the logic to extract numbers using regular expressions or other methods. You can try implementing the sum of all numbers in a string as an exercise.

