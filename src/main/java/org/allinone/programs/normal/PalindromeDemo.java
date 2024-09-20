package org.allinone.programs.normal;

public class PalindromeDemo {

    public static void main(String[] args) {
        String str = "LEVEl";
        String reversedStr = isPalindrome(str);
        if (str.equalsIgnoreCase(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    private static String isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        return reversedStr;
    }
}
