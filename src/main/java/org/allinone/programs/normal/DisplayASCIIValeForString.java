package org.allinone.programs.normal;

public class DisplayASCIIValeForString {

    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiValue = ch;
            System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
        }
    }
}

//output
//The ASCII value of H is: 72
//The ASCII value of e is: 101
//The ASCII value of l is: 108
//The ASCII value of l is: 108
//The ASCII value of o is: 111
// Explanation: Here, we have a string str = "Hello" for which we need to display the ASCII value of each character. To display the ASCII value of each character in the string, we iterate over each character in the string using a for loop. For each character, we get the ASCII value using the charAt() method and store it in the variable asciiValue. Finally, we print the character and its corresponding ASCII value.
// Complexity Analysis:
// Time Complexity: O(n), where n is the length of the input string. We iterate over each character in the string to display the ASCII value.
// Space Complexity: O(1). We are using constant space to store the ASCII value of each character. The space complexity is independent of the input string length.
// Note: The ASCII value of a character is the numeric representation of the character in the ASCII table. Each character has a unique ASCII value, which can be obtained using type casting or direct assignment. You can refer to the ASCII table to find the ASCII values of different characters. The ASCII values are useful in various programming scenarios, such as character manipulation, encoding, and decoding operations.
