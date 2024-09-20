package org.allinone.programs.normal;

public class StrongPassword {

    public static void main(String[] args) {
        String password = "Password123!";
        //System.out.println(isStrongPassword(password));
        if(isStrongPassword(password)){
            System.out.println("Password is strong");
        }else{
            System.out.println("Password is weak");
        }
    }

    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar =  false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else{
                hasSpecialChar = true;
            }
        }

        return hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;
    }

    // Output: true
    // Explanation: Here, we have a password "Password123" and we need to check if it is a strong password. A strong password should have a minimum length of 8 characters and contain at least one lowercase letter, one uppercase letter, and one digit. We iterate over the characters of the password and check if it satisfies the conditions. In this case, the password "Password123" satisfies all the conditions and is considered a strong password.
    // Complexity Analysis:
    // Time Complexity: O(n), where n is the length of the password. We iterate over the characters of the password to check for lowercase, uppercase, and digit characters.
    // Space Complexity: O(1), since we are using a fixed number of boolean variables to track the presence of lowercase, uppercase, and digit characters, which do not depend on the input size.
    // Note: This approach assumes that the password contains only ASCII characters. If the password can contain Unicode characters, you may need to modify the character checks accordingly.
}
