package org.allinone.programs.normal;

public class SumOfDigits {

    public static void main(String[] args) {
        int num = 12345;
        int sum = sumOfDigits(num);
        System.out.println("The sum of digits of " + num + " is: " + sum);
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}

// Output: The sum of digits of 12345 is: 15
// Explanation: Here, we have an integer num = 12345, and we need to find the sum of its digits. To do this, we repeatedly extract the last digit of the number using the modulo operator (%) and add it to the sum. We then update the number by removing the last digit using integer division (/). We continue this process until the number becomes 0. Finally, we return the sum of all the digits.
// Complexity Analysis:
// Time Complexity: O(log n), where n is the input number. The number of digits in the input number is proportional to log n (base 10). Therefore, the time complexity is O(log n).
// Space Complexity: O(1). We are using a constant amount of extra space to store the sum of digits. The space complexity does not depend on the input number size.
// Note: This approach calculates the sum of digits of a number. If you want to calculate the sum of all numbers (not just digits) in a number, you can modify the logic to extract numbers using mathematical operations. You can try implementing the sum of all numbers in a number as an exercise.

