package org.allinone.programs.normal;

public class JavaProgramToPrintStarPatternRightTriangle {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output:
// *
// * *
// * * *
// * * * *
// * * * * *

// Explanation: In this program, we are printing a right triangle star pattern. We have a variable rows that represents the number of rows in the triangle. We use two nested for loops to print the star pattern. The outer loop iterates over the rows, and the inner loop iterates over the columns in each row. We print a star for each column in the row. After printing the stars in a row, we move to the next line using the println() method to start a new row.

// Complexity Analysis:
// Time Complexity: O(n^2), where n is the number of rows in the triangle. We use two nested loops to print the star pattern, resulting in a quadratic time complexity.
// Space Complexity: O(1). We are using constant space to store the variables i and j. The space complexity is independent of the input size.

// Note: You can modify the number of rows in the triangle by changing the value of the rows variable. You can also customize the star pattern by changing the characters printed in the inner loop. For example, you can print numbers, alphabets, or any other character instead of stars. You can experiment with different patterns by adjusting the loop conditions and the characters printed. This program demonstrates a simple way to print a right triangle star pattern using nested loops in Java. You can try implementing other types of star patterns, such as left triangle, inverted right triangle, or pyramid patterns, as an exercise.